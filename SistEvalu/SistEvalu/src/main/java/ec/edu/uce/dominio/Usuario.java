package ec.edu.uce.dominio;

import java.util.regex.Pattern;

import java.util.regex.Pattern;

public class Usuario {

    // Atributos
    protected String nombre;
    protected String email;
    protected String contraseña;
    protected String tipoUsuario;

    // Constructor por defecto
    public Usuario() {
        this.nombre = "Sin nombre";
        this.email = "Sin email";
        this.contraseña = ""; // Sin contraseña predeterminada
        this.tipoUsuario = "Invitado";
    }

    // Constructor con parámetros
    public Usuario(String nombre, String email, String contraseña, String tipoUsuario) {
        this(); // Llama al constructor por defecto
        setNombre(nombre);
        setEmail(email);
        setContraseña(contraseña);
        setTipoUsuario(tipoUsuario);
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email == null || !email.matches("^[^@\\s]+@[^@\\s]+\\.[^@\\s]+$")) {
            throw new IllegalArgumentException("El email no tiene un formato válido.");
        }
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        if (contraseña == null || contraseña.length() < 8 || !contraseña.matches(".*\\d.*")) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres y contener un número.");
        }
        this.contraseña = contraseña;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        if (tipoUsuario == null || tipoUsuario.trim().isEmpty()) {
            throw new IllegalArgumentException("El tipo de usuario no puede estar vacío.");
        }
        // Validación para tipos de usuario predefinidos
        if (!tipoUsuario.equals("Admin") && !tipoUsuario.equals("Estudiante") && !tipoUsuario.equals("Profesor") && !tipoUsuario.equals("Invitado")) {
            throw new IllegalArgumentException("Tipo de usuario inválido.");
        }
        this.tipoUsuario = tipoUsuario;
    }

    // Método para validar usuario
    public boolean validarUsuario(String email, String contraseña) {
        return this.email.equals(email) && this.contraseña.equals(contraseña);
    }

    // Método toString para representar la clase de forma legible (sin mostrar la contraseña)
    @Override
    public String toString() {
        return "Usuario{" +
                "nombre='" + nombre + '\'' +
                ", email='" + email + '\'' +
                ", tipoUsuario='" + tipoUsuario + '\'' +
                '}';
    }
}

