package ec.edu.uce.dominio;

import java.util.regex.Pattern;

public class Usuario {

    // Atributos
    protected String nombre;
    protected String email;
    protected String contraseña;
    protected String tipoUsuario;

    // Constructor
    public Usuario(String nombre, String email, String contraseña, String tipoUsuario) {
        setNombre(nombre);
        setEmail(email);
        setContraseña(contraseña);
        setTipoUsuario(tipoUsuario);
    }

    // Métodos get y set
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no debe estar vacío.");
        }
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (!esEmailValido(email)) {
            throw new IllegalArgumentException("El email no tiene un formato válido.");
        }
        this.email = email;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        if (!esContraseñaValida(contraseña)) {
            throw new IllegalArgumentException("La contraseña debe tener al menos 8 caracteres y contener al menos un número.");
        }
        this.contraseña = contraseña;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        if (tipoUsuario == null || tipoUsuario.isEmpty()) {
            throw new IllegalArgumentException("El tipo de usuario no debe estar vacío.");
        }
        this.tipoUsuario = tipoUsuario;
    }

    // Método para validar usuario
    public boolean validarUsuario(String email, String contraseña) {
        return this.email.equals(email) && this.contraseña.equals(contraseña);
    }

    // Validaciones auxiliares
    private boolean esEmailValido(String email) {
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email != null && Pattern.matches(emailRegex, email);
    }

    private boolean esContraseñaValida(String contraseña) {
        String passwordRegex = "^(?=.*[0-9]).{8,}$";
        return contraseña != null && Pattern.matches(passwordRegex, contraseña);
    }
}
