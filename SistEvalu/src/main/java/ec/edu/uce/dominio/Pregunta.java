package ec.edu.uce.dominio;

import java.util.HashSet;

public class Pregunta {

    // Atributos
    private String pregunta;
    private Respuesta[] respuestas;

    // Constructor
    public Pregunta(String pregunta, Respuesta[] respuestas, HashSet<String> preguntasExistentes) {
        setPregunta(pregunta, preguntasExistentes);
        setRespuestas(respuestas);
    }

    // Métodos get y set
    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta, HashSet<String> preguntasExistentes) {
        if (pregunta == null || pregunta.isEmpty()) {
            throw new IllegalArgumentException("La pregunta no debe estar vacía.");
        }
        if (preguntasExistentes.contains(pregunta)) {
            throw new IllegalArgumentException("La pregunta ya existe.");
        }
        preguntasExistentes.add(pregunta);
        this.pregunta = pregunta;
    }

    public Respuesta[] getRespuestas() {
        return respuestas;
    }

    public void setRespuestas(Respuesta[] respuestas) {
        if (respuestas == null || respuestas.length == 0) {
            throw new IllegalArgumentException("Debe haber al menos una respuesta.");
        }

        // Verificar que no haya respuestas duplicadas
        HashSet<String> respuestasUnicas = new HashSet<>();
        for (Respuesta r : respuestas) {
            if (respuestasUnicas.contains(r.getRespuesta())) {
                throw new IllegalArgumentException("Las respuestas contienen duplicados: " + r.getRespuesta());
            }
            respuestasUnicas.add(r.getRespuesta());
        }

        this.respuestas = respuestas;
    }
}
