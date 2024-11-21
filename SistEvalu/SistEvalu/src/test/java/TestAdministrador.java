import ec.edu.uce.dominio.Administrador;

import java.util.HashSet;

public class TestAdministrador {
    public static void main(String[] args) {
        // Crear un conjunto estático para almacenar IDs ya existentes
        HashSet<Integer> idsExistentes = new HashSet<>();

        // Caso 1: Creación de un Administrador con un ID válido
        Administrador admin1 = crearAdministrador("Alice", "alice@example.com", "abcd1234", "Admin", 1, idsExistentes);

        if (admin1 != null) {
            System.out.println("Administrador creado con éxito: " + admin1.getNombre() + " con ID " + admin1.getIdAdministrador());
        } else {
            System.out.println("Fallo en la creación del Administrador.");
        }

        // Caso 2: Intento de creación con un ID ya existente
        Administrador admin2 = crearAdministrador("Bob", "bob@example.com", "2abcd", "Admin", 1, idsExistentes);

        if (admin2 == null) {
            System.out.println("No se pudo crear el Administrador Bob con el ID 1 porque ya existe.");
        } else {
            System.out.println("Administrador creado con éxito: " + admin2.getNombre());
        }

        // Caso 3: Creación con un ID inválido (ID <= 0)
        Administrador admin3 = crearAdministrador("Charlie", "charlie@example.com", "xyz", "Admin", -2, idsExistentes);

        if (admin3 == null) {
            System.out.println("No se pudo crear el Administrador Charlie con un ID inválido.");
        } else {
            System.out.println("Administrador creado con éxito: " + admin3.getNombre());
        }
    }

    // Método auxiliar para crear Administradores de manera segura usando if-else
    private static Administrador crearAdministrador(String nombre, String email, String contraseña, String tipoUsuario, int idAdministrador, HashSet<Integer> idsExistentes) {
        // Verificar si el ID es válido y único
        if (idAdministrador <= 0) {
            System.out.println("Error: El ID del Administrador debe ser un número positivo.");
            return null;
        }

        // Verificar que el ID no se repita (comprobamos en el conjunto de IDs existentes)
        if (idsExistentes.contains(idAdministrador)) {
            System.out.println("Error: El ID del Administrador debe ser único.");
            return null;
        }

        // Si pasa las validaciones, crear y devolver el Administrador
        Administrador nuevoAdmin = new Administrador(nombre, email, contraseña, tipoUsuario, idAdministrador);
        // Agregar el nuevo ID al conjunto de IDs existentes
        idsExistentes.add(idAdministrador);
        return nuevoAdmin;
    }
}
