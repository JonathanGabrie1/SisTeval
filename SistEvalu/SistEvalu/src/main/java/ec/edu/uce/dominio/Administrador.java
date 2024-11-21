package ec.edu.uce.dominio;

import java.util.HashSet;

public class Administrador extends Usuario {
    private int idAdministrador;

    // Constructor por defecto
    public Administrador() {
        super(); // Llama al constructor por defecto de Usuario
        this.idAdministrador = 0; // Inicializa idAdministrador con un valor por defecto
    }

    // Constructor con parámetros
    public Administrador(String nombre, String email, String contraseña, String tipoUsuario, int idAdministrador) {
        this(); // Llama al constructor por defecto
        this.setNombre(nombre); // Usa los métodos heredados de Usuario
        this.setEmail(email);
        this.setContraseña(contraseña);
        this.setTipoUsuario(tipoUsuario);
        this.setIdAdministrador(idAdministrador); // Asigna idAdministrador usando el setter
    }

    // Getter y Setter para idAdministrador
    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        if (idAdministrador <= 0) {
            throw new IllegalArgumentException("El idAdministrador debe ser único y positivo.");
        }
        this.idAdministrador = idAdministrador;
    }
}

