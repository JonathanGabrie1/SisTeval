package ec.edu.uce.dominio;

import java.util.HashSet;

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
        if (asignatura == null || asignatura.trim().isEmpty()) {
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

        // Verificar que no haya preguntas base duplicadas
        HashSet<Integer> idsPreguntasUnicas = new HashSet<>();
        for (PreguntaBase pregunta : preguntasBase) {
            if (idsPreguntasUnicas.contains(pregunta.getIdPreguntaBase())) {
                throw new IllegalArgumentException("La pregunta base con id " + pregunta.getIdPreguntaBase() + " ya existe.");
            }
            idsPreguntasUnicas.add(pregunta.getIdPreguntaBase());
        }

        this.preguntasBase = preguntasBase;
    }

    // Método toString para mostrar el estado del objeto
    @Override
    public String toString() {
        StringBuilder preguntasStr = new StringBuilder();
        for (PreguntaBase pregunta : preguntasBase) {
            preguntasStr.append("Pregunta ID: ").append(pregunta.getIdPreguntaBase()).append(", ")
                    .append("Pregunta: ").append(pregunta.getPregunta()).append("\n");
        }
        return "Simulador{" +
                "idSimulador=" + idSimulador +
                ", asignatura='" + asignatura + '\'' +
                ", preguntasBase=\n" + preguntasStr.toString() +
                '}';
    }
}
