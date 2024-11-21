package ec.edu.uce.dominio;

import java.util.Date;

public class Examen {

    // Atributos
    private int idExamen;
    private String asignatura;
    private Date fecha;
    private Pregunta[] preguntas;
    private float calificacion;

    // Constructor
    public Examen(int idExamen, String asignatura, Date fecha, Pregunta[] preguntas, float calificacion) {
        setIdExamen(idExamen);
        setTitulo(asignatura);
        setFecha(fecha);
        setPreguntas(preguntas);
        setCalificacion(calificacion);
    }

    // Métodos get y set
    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        if (idExamen <= 0) {
            throw new IllegalArgumentException("El idExamen debe ser un número positivo y único.");
        }
        this.idExamen = idExamen;
    }

    public String getTitulo() {
        return asignatura;
    }

    public void setTitulo(String asignatura) {
        if (asignatura == null || asignatura.isEmpty()) {
            throw new IllegalArgumentException("El título de la asignatura no debe estar vacío.");
        }
        this.asignatura = asignatura;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        if (fecha == null) {
            throw new IllegalArgumentException("La fecha no debe ser nula.");
        }
        this.fecha = fecha;
    }

    public Pregunta[] getPreguntas() {
        return preguntas;
    }

    public void setPreguntas(Pregunta[] preguntas) {
        if (preguntas == null || preguntas.length == 0) {
            throw new IllegalArgumentException("El examen debe contener al menos una pregunta.");
        }
        this.preguntas = preguntas;
    }

    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        if (calificacion < 0 || calificacion > 20) {
            throw new IllegalArgumentException("La calificación debe estar entre 0 y 20.");
        }
        this.calificacion = calificacion;
    }
}
