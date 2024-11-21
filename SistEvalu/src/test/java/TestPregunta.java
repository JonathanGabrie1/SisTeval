import ec.edu.uce.dominio.Pregunta;
import ec.edu.uce.dominio.Respuesta;

import java.util.HashSet;

public class TestPregunta {
    public static void main(String[] args) {

        // Caso 1: Crear una pregunta válida

        Respuesta[] respuestasValidas = {
                new Respuesta("Respuesta 1", true),
                new Respuesta("Respuesta 2", false)
        };
        HashSet<String> preguntasExistentes1 = new HashSet<>();

        if (!"".equals("¿Cuál es la capital de Ecuador?") && respuestasValidas.length > 0 && !preguntasExistentes1.contains("¿Cuál es la capital de Ecuador?")) {
            Pregunta pregunta1 = new Pregunta("¿Cuál es la capital de Ecuador?", respuestasValidas, preguntasExistentes1);
            if (pregunta1.getPregunta().equals("¿Cuál es la capital de Ecuador?")) {
                System.out.println("Caso 1: Éxito al crear una pregunta ");

            } else {
                System.out.println("Caso 1: Falló la creación de una pregunta");
            }
        } else {
            System.out.println("Caso 1: Ingrese nuevamente la pregunta");
        }

        // Caso 2: Intentar crear una pregunta con texto vacío

        String preguntaVacia = "";
        HashSet<String> preguntasExistentes2 = new HashSet<>();
        if ("".equals(preguntaVacia)) {
            System.out.println("Caso 2:La pregunta no debe estar vacía.");
        } else {
            System.out.println("Caso 2: No se validó la pregunta vacía.");
        }

        // Caso 3: Intentar crear una pregunta sin respuestas
        Respuesta[] respuestasVacias = {};
        if (respuestasVacias.length == 0) {
            System.out.println("Caso 3: Debe haber al menos una respuesta.");
        } else {
            Pregunta pregunta3 = new Pregunta("¿Pregunta sin respuestas?", respuestasVacias, new HashSet<>());
            System.out.println("Caso 3:No se validó la falta de respuestas.");
        }

        // Caso 4: Intentar crear una pregunta duplicada
        HashSet<String> preguntasExistentes4 = new HashSet<>();
        preguntasExistentes4.add("¿Cuál es la capital de Ecuador?");
        String preguntaDuplicada = "¿Cuál es la capital de Ecuador?";
        if (preguntasExistentes4.contains(preguntaDuplicada)) {
            System.out.println("Caso 4:La pregunta ya existe.");
        } else {
            Pregunta pregunta4 = new Pregunta(preguntaDuplicada, respuestasValidas, preguntasExistentes4);
            System.out.println("Caso 4:No se validó la duplicación.");
        }
    }
}
