package ec.edu.uce.dominio;

public class Simulador {

    // Atributos
    private int idSimulador;
    private String asignatura;
    private PreguntaBase[] preguntasBase;

    // Constructor
    public Simulador(int idSimulador, String asignatura, PreguntaBase[] preguntasBase) {
        setIdSimulador(idSimulador);
        setAsignatura(asignatura);
        setPreguntasBase(preguntasBase);
    }

    // Métodos get y set
    public int getIdSimulador() {
        return idSimulador;
    }

    public void setIdSimulador(int idSimulador) {
        if (idSimulador <= 0) {
            throw new IllegalArgumentException("El idSimulador debe ser un número positivo.");
        }
        this.idSimulador = idSimulador;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        if (asignatura == null || asignatura.isEmpty()) {
            throw new IllegalArgumentException("La asignatura no debe estar vacía.");
        }
        this.asignatura = asignatura;
    }

    public PreguntaBase[] getPreguntasBase() {
        return preguntasBase;
    }

    public void setPreguntasBase(PreguntaBase[] preguntasBase) {
        if (preguntasBase == null || preguntasBase.length == 0) {
            throw new IllegalArgumentException("Debe haber al menos una pregunta base.");
        }
        this.preguntasBase = preguntasBase;
    }
}
