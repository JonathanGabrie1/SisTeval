import ec.edu.uce.dominio.SesionExamen;

import java.util.Arrays;

public class TestSesionExamen {
    public static void main(String[] args) {
        // Simulación de datos de prueba
        Examen examenMock = new Examen(); // Supongamos que existe una clase Examen y su constructor por defecto.
        int[] calificacionesIniciales = {15, 18, 12};

        // Prueba de creación del objeto SesionExamen
        try {
            SesionExamen sesion = new SesionExamen(1, examenMock, calificacionesIniciales);

            // Pruebas de atributos iniciales
            if (sesion.getIdSesion() == 1) {
                System.out.println("Prueba de idSesion: Correcto");
            } else {
                System.out.println("Prueba de idSesion: Incorrecto");
            }

            if (sesion.getExamen() == examenMock) {
                System.out.println("Prueba de examen asignado: Correcto");
            } else {
                System.out.println("Prueba de examen asignado: Incorrecto");
            }

            if (Arrays.equals(sesion.getCalificaciones(), calificacionesIniciales)) {
                System.out.println("Prueba de calificaciones iniciales: Correcto");
            } else {
                System.out.println("Prueba de calificaciones iniciales: Incorrecto");
            }

            // Prueba de setCalificacion con valor válido
            try {
                sesion.setCalificacion(17.5f);
                if (sesion.getCalificacion() == 17.5f) {
                    System.out.println("Prueba de setCalificacion con valor válido: Correcto");
                } else {
                    System.out.println("Prueba de setCalificacion con valor válido: Incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error inesperado al establecer calificación: " + e.getMessage());
            }

            // Prueba de setCalificacion con valor inválido
            try {
                sesion.setCalificacion(25f);
                System.out.println("Prueba de setCalificacion con valor inválido: Incorrecto (debería lanzar excepción)");
            } catch (IllegalArgumentException e) {
                System.out.println("Prueba de setCalificacion con valor inválido: Correcto (se lanzó excepción)");
            }

            // Prueba de configurarSesion
            try {
                sesion.configurarSesion();
                if (sesionActivaReflection(sesion)) { // Uso de reflexión para acceder a la variable privada
                    System.out.println("Prueba de configurarSesion: Correcto");
                } else {
                    System.out.println("Prueba de configurarSesion: Incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error al configurar la sesión: " + e.getMessage());
            }

            // Prueba de controlarAcceso con sesión activa
            try {
                sesion.controlarAcceso();
                System.out.println("Prueba de controlarAcceso con sesión activa: Correcto");
            } catch (IllegalStateException e) {
                System.out.println("Prueba de controlarAcceso con sesión activa: Incorrecto - " + e.getMessage());
            }

            // Prueba de finalizarAcceso
            try {
                sesion.finalizarAcceso();
                if (!sesionActivaReflection(sesion)) { // Uso de reflexión para verificar que la sesión se desactivó
                    System.out.println("Prueba de finalizarAcceso: Correcto");
                } else {
                    System.out.println("Prueba de finalizarAcceso: Incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error al finalizar la sesión: " + e.getMessage());
            }

            // Prueba de controlarAcceso con sesión inactiva
            try {
                sesion.controlarAcceso();
                System.out.println("Prueba de controlarAcceso con sesión inactiva: Incorrecto (debería lanzar excepción)");
            } catch (IllegalStateException e) {
                System.out.println("Prueba de controlarAcceso con sesión inactiva: Correcto (se lanzó excepción)");
            }

        } catch (Exception e) {
            System.out.println("Error al crear la SesionExamen: " + e.getMessage());
        }
    }

    // Método auxiliar para acceder a la variable privada 'sesionActiva' usando reflexión
    private static boolean sesionActivaReflection(SesionExamen sesion) {
        try {
            java.lang.reflect.Field field = SesionExamen.class.getDeclaredField("sesionActiva");
            field.setAccessible(true);
            return (boolean) field.get(sesion);
        } catch (Exception e) {
            System.out.println("Error al acceder al estado de la sesión: " + e.getMessage());
            return false;
        }
    }
}
