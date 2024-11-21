import ec.edu.uce.dominio.Docente;
import ec.edu.uce.dominio.Examen;

public class TestDocente {
    public static void main(String[] args) {
        testConstructorConParametros();
        testSetters();
        testCrearExamen();
        testEditarExamen();
        testEliminarExamen();
        testAgregarCalificacion();
    }

    private static void testConstructorConParametros() {
        System.out.println("Prueba del constructor con parámetros:");

        Docente docente = new Docente("Juan Perez", "juan.perez@example.com", "password123", "Docente", "Matemáticas");

        if (docente.getNombre().equals("Juan Perez") &&
                docente.getEmail().equals("juan.perez@example.com") &&
                docente.getContraseña().equals("password123") &&
                docente.getTipoUsuario().equals("Docente") &&
                docente.getAsignatura().equals("Matemáticas")) {
            System.out.println("Constructor con parámetros: PASADO");
        } else {
            System.out.println("Constructor con parámetros: FALLIDO");
        }

        System.out.println();
    }

    private static void testSetters() {
        System.out.println("Prueba de setters:");

        Docente docente = new Docente("Ana Lopez", "ana.lopez@example.com", "Ana2023*", "Docente", "Ciencias");

        // Probamos los setters
        docente.setAsignatura("Física");

        if (docente.getAsignatura().equals("Física")) {
            System.out.println("Setter de asignatura: PASADO");
        } else {
            System.out.println("Setter de asignatura: FALLIDO");
        }

        System.out.println();
    }

    private static void testCrearExamen() {
        System.out.println("Prueba de crear examen:");

        Docente docente = new Docente("Luis Ortega", "luis.ortega@example.com", "Luis12345", "Docente", "Química");

        Examen examen = new Examen("Examen de Química", 1);
        docente.crearExamen(examen);

        if (docente.getExamenesCreados().length == 1 &&
                docente.getExamenesCreados()[0].getIdExamen() == 1) {
            System.out.println("Crear examen: PASADO");
        } else {
            System.out.println("Crear examen: FALLIDO");
        }

        System.out.println();
    }

    private static void testEditarExamen() {
        System.out.println("Prueba de editar examen:");

        Docente docente = new Docente("Luis Ortega", "luis.ortega@example.com", "Luis12345", "Docente", "Química");

        Examen examen = new Examen("Examen de Química", 1);
        docente.crearExamen(examen);

        Examen examenNuevo = new Examen("Examen de Química Avanzada", 1);
        docente.editarExamen(0, examenNuevo);

        if (docente.getExamenesCreados()[0].getIdExamen() == 1 &&
                docente.getExamenesCreados()[0].getNombre().equals("Examen de Química Avanzada")) {
            System.out.println("Editar examen: PASADO");
        } else {
            System.out.println("Editar examen: FALLIDO");
        }

        System.out.println();
    }

    private static void testEliminarExamen() {
        System.out.println("Prueba de eliminar examen:");

        Docente docente = new Docente("Luis Ortega", "luis.ortega@example.com", "Luis12345", "Docente", "Química");

        Examen examen = new Examen("Examen de Química", 1);
        docente.crearExamen(examen);

        docente.eliminarExamen(0);

        if (docente.getExamenesCreados().length == 0) {
            System.out.println("Eliminar examen: PASADO");
        } else {
            System.out.println("Eliminar examen: FALLIDO");
        }

        System.out.println();
    }

    private static void testAgregarCalificacion() {
        System.out.println("Prueba de agregar calificación:");

        Docente docente = new Docente("Luis Ortega", "luis.ortega@example.com", "Luis12345", "Docente", "Química");

        Examen examen = new Examen("Examen de Química", 1);
        docente.crearExamen(examen);

        //docente.agregarCalificacion(0, 18);

        //if (docente.getExamenesCreados()[0].getCalificacion() == 18) {
        //    System.out.println("Agregar calificación: PASADO");
        //} else {
        //    System.out.println("Agregar calificación: FALLIDO");
        //}

        System.out.println();
    }
}
