package ec.edu.uce.dominio;

import java.util.HashSet;

import java.util.HashSet;

public class Respuesta {

    // Atributos
    private String respuesta;
    private boolean esCorrecta;

    // Constructor por defecto
    public Respuesta() {
        this.respuesta = "Sin respuesta";
        this.esCorrecta = false;
    }

    // Constructor con parámetros
    public Respuesta(String respuesta, boolean esCorrecta, HashSet<String> respuestasExistentes) {
        setRespuesta(respuesta, respuestasExistentes);
        setEsCorrecta(esCorrecta);
    }

    // Métodos get y set
    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta, HashSet<String> respuestasExistentes) {
        if (respuesta == null || respuesta.isEmpty()) {
            throw new IllegalArgumentException("La respuesta no debe estar vacía.");
        }
        if (respuestasExistentes.contains(respuesta)) {
            throw new IllegalArgumentException("La respuesta ya está duplicada.");
        }
        respuestasExistentes.add(respuesta);
        this.respuesta = respuesta;
    }

    public boolean getEsCorrecta() {
        return esCorrecta;
    }

    public void setEsCorrecta(boolean esCorrecta) {
        this.esCorrecta = esCorrecta;
    }

    // Método para visualizar el estado del objeto
    @Override
    public String toString() {
        return "Respuesta{" +
                "respuesta='" + respuesta + '\'' +
                ", esCorrecta=" + esCorrecta +
                '}';
    }
}
