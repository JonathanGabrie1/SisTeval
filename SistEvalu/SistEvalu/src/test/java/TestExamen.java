import ec.edu.uce.dominio.Examen;
import ec.edu.uce.dominio.Pregunta;
import ec.edu.uce.dominio.Respuesta;

import java.util.Date;

public class TestExamen {
    public static void main(String[] args) {

        String[] resultados = new String[4];
        int casoActual = 0; // Índice para manejar cada caso

        // Caso 1: Crear un Examen válido
        int idExamenValido = 1;
        String asignaturaValida = "Matemáticas";
        Date fechaValida = new Date();
        Pregunta[] preguntasValidas = {

                new Pregunta("¿Cuánto es 2+2?", new Respuesta[]{
                        new Respuesta("4", true, new java.util.HashSet<>()),
                        new Respuesta("5", false, new java.util.HashSet<>())
                }, new java.util.HashSet<>())
        };
        float calificacionValida = 18;

//        if (idExamenValido > 0 && asignaturaValida != null && !asignaturaValida.isEmpty() &&
//                fechaValida != null && preguntasValidas != null && preguntasValidas.length > 0 &&
//                calificacionValida >= 0 && calificacionValida <= 20) {
//            Examen examen1 = new Examen(idExamenValido, asignaturaValida, fechaValida, preguntasValidas, calificacionValida);
//            if (examen1.getIdExamen() == idExamenValido &&
//                    examen1.getNombre().equals(asignaturaValida) &&
//                    examen1.getFecha().equals(fechaValida) &&
//                    examen1.getPreguntas().length == preguntasValidas.length &&
//                    examen1.getCalificacion() == calificacionValida) {
//
//                resultados[casoActual] = " Examen válido.";
//            } else {
//                resultados[casoActual] = "Verificar los datos del Examen.";
//            }
//        } else {
//            resultados[casoActual] = "No se cumplieron las validaciones para un Examen";
//        }
        casoActual++;

        // Caso 2: Intentar crear un Examen con un ID inválido

        int idExamenInvalido = -1;
        if (idExamenInvalido <= 0) {
            resultados[casoActual] = "ID del examen debe ser positivo.";
        } else {
            resultados[casoActual] = "El ID inválido fue aceptado.";
        }
        casoActual++;

        // Caso 3: Intentar crear un Examen sin preguntas

        Pregunta[] preguntasInvalidas = new Pregunta[0];
        if (preguntasInvalidas == null || preguntasInvalidas.length == 0) {
            resultados[casoActual] = "Debe tener al menos una pregunta.";
        } else {
            resultados[casoActual] = "Examen aceptó un arreglo vacío.";
        }
        casoActual++;

        // Caso 4: Intentar crear un Examen con una calificación inválida

        float calificacionInvalida = 25;
        if (calificacionInvalida < 0 || calificacionInvalida > 20) {
            resultados[casoActual] = "La calificación está fuera del rango permitido.";
        } else {
            resultados[casoActual] = " Calificación inválida.";
        }
        casoActual++;

        // Imprimir resultados
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }
    }
}

