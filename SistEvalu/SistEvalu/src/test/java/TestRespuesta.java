import ec.edu.uce.dominio.Respuesta;

import java.util.HashSet;

public class TestRespuesta {
    public static void main(String[] args) {

        String[] resultados = new String[4];
        int casoActual = 0; // Índice para manejar cada caso

        // Caso 1: Crear una Respuesta válida
        String respuestaValida = "Madrid";
        boolean esCorrectaValida = true;
        HashSet<String> respuestasExistentes = new HashSet<>();

        if (respuestaValida != null && !respuestaValida.isEmpty()) {
            if (!respuestasExistentes.contains(respuestaValida)) {
                Respuesta respuesta1 = new Respuesta(respuestaValida, esCorrectaValida, respuestasExistentes);
                if (respuesta1.getRespuesta().equals(respuestaValida) && respuesta1.getEsCorrecta() == esCorrectaValida) {
                    resultados[casoActual] = " Respuesta válida.";
                } else {
                    resultados[casoActual] = "Verificar los datos de la Respuesta.";
                }
            } else {
                resultados[casoActual] = "La respuesta ya existe.";
            }
        } else {
            resultados[casoActual] = " La respuesta no debe estar vacía.";
        }
        casoActual++;

        // Caso 2: Intentar crear una Respuesta con texto vacío

        String respuestaInvalida = " ";
        if (respuestaInvalida == null || respuestaInvalida.isEmpty()) {
            resultados[casoActual] = " La respuesta no debe estar vacía.";
        } else {
            resultados[casoActual] = "No se validó la respuesta vacía.";
        }
        casoActual++;

        // Caso 3: Intentar crear una Respuesta duplicada

        String respuestaDuplicada = "Madrid";
        respuestasExistentes.add(respuestaDuplicada);
        if (respuestasExistentes.contains(respuestaDuplicada)) {
            resultados[casoActual] = "La respuesta ya está duplicada.";
        } else {
            resultados[casoActual] = "No se detectó la respuesta duplicada.";
        }
        casoActual++;

        // Caso 4: Crear una Respuesta válida con valor booleano false
        String nuevaRespuesta = "Barcelona";
        boolean esCorrectaFalsa = false;
        if (nuevaRespuesta != null && !nuevaRespuesta.isEmpty()) {
            if (!respuestasExistentes.contains(nuevaRespuesta)) {
                Respuesta respuesta2 = new Respuesta(nuevaRespuesta, esCorrectaFalsa, respuestasExistentes);
                if (respuesta2.getRespuesta().equals(nuevaRespuesta) && !respuesta2.getEsCorrecta()) {
                    resultados[casoActual] = " Respuesta válida con 'esCorrecta' = false.";
                } else {
                    resultados[casoActual] = "Verificar los datos de la Respuesta.";
                }
            } else {
                resultados[casoActual] = "La respuesta ya existe.";
            }
        } else {
            resultados[casoActual] = "La respuesta no debe estar vacía.";
        }
        casoActual++;

        // Imprimir resultados
        for (int i = 0; i < resultados.length; i++) {
            System.out.println(resultados[i]);
        }
    }
}
