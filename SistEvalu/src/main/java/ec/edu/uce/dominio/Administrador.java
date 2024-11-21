package ec.edu.uce.dominio;

import java.util.HashSet;

public class Administrador extends Usuario {

    // Atributos
    private int idAdministrador;
    private static HashSet<Integer> idsAdministradorExistentes = new HashSet<>(); // Para verificar unicidad

    // Constructor con parametros
    public Administrador(String nombre, String email, String contraseña, String tipoUsuario, int idAdministrador) {
        super(nombre, email, contraseña, tipoUsuario); // Llamada al constructor de la clase base Usuario
        setIdAdministrador(idAdministrador);
    }

    // Métodos get y set
    public int getIdAdministrador() {
        return idAdministrador;
    }

    public void setIdAdministrador(int idAdministrador) {
        if (idAdministrador <= 0) {
            throw new IllegalArgumentException("El idAdministrador debe ser un número entero positivo.");
        }
        if (idsAdministradorExistentes.contains(idAdministrador)) {
            throw new IllegalArgumentException("El idAdministrador debe ser único.");
        }
        idsAdministradorExistentes.add(idAdministrador);
        this.idAdministrador = idAdministrador;
    }

    // Método para gestionar el tipo de usuario
    public void gestionarTipoUsuario(Usuario usuario, String nuevoTipoUsuario) {
        if (usuario == null || nuevoTipoUsuario == null || nuevoTipoUsuario.isEmpty()) {
            throw new IllegalArgumentException("Usuario o tipo de usuario no pueden ser nulos o vacíos.");
        }
        usuario.setTipoUsuario(nuevoTipoUsuario); // Actualiza el tipo de usuario
        System.out.println("El tipo de usuario de " + usuario.getNombre() + " ha sido actualizado a: " + nuevoTipoUsuario);
    }

    // Método para configurar sesión de exámenes
    public void configurarSesionExamenes() {
        System.out.println("La sesión de exámenes ha sido configurada.");
    }

    // Método para controlar accesos a exámenes
    public void controlarAccesosExamenes() {
        System.out.println("El acceso a los exámenes ha sido controlado.");
    }
}
