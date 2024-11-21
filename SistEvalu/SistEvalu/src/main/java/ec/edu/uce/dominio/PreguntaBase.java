package ec.edu.uce.dominio;

public class PreguntaBase {

    // Atributos
    private int idPreguntaBase;
    private String pregunta;
    private String respuesta;

    // Constructor por defecto
    public PreguntaBase() {
        this.idPreguntaBase = 0;
        this.pregunta = "Sin definir";
        this.respuesta = "Sin definir";
    }

    // Constructor con parámetros
    public PreguntaBase(int idPreguntaBase, String pregunta, String respuesta) {
        setIdPreguntaBase(idPreguntaBase);
        setPregunta(pregunta);
        setRespuesta(respuesta);
    }

    // Métodos get y set
    public int getIdPreguntaBase() {
        return idPreguntaBase;
    }

    public void setIdPreguntaBase(int idPreguntaBase) {
        if (idPreguntaBase <= 0) {
            throw new IllegalArgumentException("El idPreguntaBase debe ser un número entero positivo.");
        }
        this.idPreguntaBase = idPreguntaBase;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        if (pregunta == null || pregunta.trim().isEmpty()) {
            throw new IllegalArgumentException("La pregunta no debe estar vacía.");
        }
        this.pregunta = pregunta;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        if (respuesta == null || respuesta.trim().isEmpty()) {
            throw new IllegalArgumentException("La respuesta no debe estar vacía.");
        }
        this.respuesta = respuesta;
    }

    // Método para visualizar el estado del objeto
    @Override
    public String toString() {
        return "PreguntaBase{" +
                "idPreguntaBase=" + idPreguntaBase +
                ", pregunta='" + pregunta + '\'' +
                ", respuesta='" + respuesta + '\'' +
                '}';
    }
}
