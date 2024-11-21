import ec.edu.uce.dominio.Estudiante;
import ec.edu.uce.dominio.Simulador;

public class TestEstudiante {
    public static void main(String[] args) {
        // Crear un estudiante de prueba
        try {
            Simulador[] simuladoresRealizados = new Simulador[0]; // Supongamos que es una matriz vacía de simuladores
            int[] calificaciones = {15, 18, 20};

            Estudiante estudiante = new Estudiante("Juan Pérez", "juan.perez@example.com", "password123", "Estudiante", "MAT123", simuladoresRealizados, calificaciones);

            // Prueba del constructor
            if ("Juan Pérez".equals(estudiante.getNombre())) {
                System.out.println("Prueba del nombre: Correcto");
            } else {
                System.out.println("Prueba del nombre: Incorrecto");
            }

            if ("juan.perez@example.com".equals(estudiante.getEmail())) {
                System.out.println("Prueba del email: Correcto");
            } else {
                System.out.println("Prueba del email: Incorrecto");
            }

            if ("MAT123".equals(estudiante.getMatricula())) {
                System.out.println("Prueba de la matrícula: Correcto");
            } else {
                System.out.println("Prueba de la matrícula: Incorrecto");
            }

            // Prueba de setMatricula con valor válido
            try {
                estudiante.setMatricula("MAT456");
                if ("MAT456".equals(estudiante.getMatricula())) {
                    System.out.println("Prueba de setMatricula con valor válido: Correcto");
                } else {
                    System.out.println("Prueba de setMatricula con valor válido: Incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Prueba de setMatricula con valor válido: Error inesperado - " + e.getMessage());
            }

            // Prueba de setMatricula con valor nulo o vacío
            try {
                estudiante.setMatricula("");
                System.out.println("Prueba de setMatricula con valor vacío: Incorrecto (debería lanzar excepción)");
            } catch (IllegalArgumentException e) {
                System.out.println("Prueba de setMatricula con valor vacío: Correcto (se lanzó excepción)");
            }

            try {
                estudiante.setMatricula(null);
                System.out.println("Prueba de setMatricula con valor nulo: Incorrecto (debería lanzar excepción)");
            } catch (IllegalArgumentException e) {
                System.out.println("Prueba de setMatricula con valor nulo: Correcto (se lanzó excepción)");
            }

            // Prueba de setCalificaciones con valores válidos
            int[] nuevasCalificaciones = {12, 14, 16};
            estudiante.setCalificaciones(nuevasCalificaciones);
            if (estudiante.getCalificaciones().length == 3 && estudiante.getCalificaciones()[0] == 12) {
                System.out.println("Prueba de setCalificaciones con valores válidos: Correcto");
            } else {
                System.out.println("Prueba de setCalificaciones con valores válidos: Incorrecto");
            }

            // Prueba de setCalificaciones con valores inválidos
            try {
                estudiante.setCalificaciones(new int[]{});
                System.out.println("Prueba de setCalificaciones con arreglo vacío: Incorrecto (debería lanzar excepción)");
            } catch (IllegalArgumentException e) {
                System.out.println("Prueba de setCalificaciones con arreglo vacío: Correcto (se lanzó excepción)");
            }

            try {
                estudiante.setCalificaciones(new int[]{21, -1, 15});
                System.out.println("Prueba de setCalificaciones con valores fuera de rango: Incorrecto (debería lanzar excepción)");
            } catch (IllegalArgumentException e) {
                System.out.println("Prueba de setCalificaciones con valores fuera de rango: Correcto (se lanzó excepción)");
            }

        } catch (Exception e) {
            System.out.println("Error al crear el estudiante: " + e.getMessage());
        }
    }
}
