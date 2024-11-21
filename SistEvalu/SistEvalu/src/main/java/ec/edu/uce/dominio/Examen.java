package ec.edu.uce.dominio;

public class Examen {
    private String nombre;
    private int idExamen;
    private int calificacion; // Campo para la calificación

    // Constructor
    public Examen(String nombre, int idExamen) {
        this.nombre = nombre;
        this.idExamen = idExamen;
        this.calificacion = -1; // Inicializamos con un valor por defecto
    }

    // Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getIdExamen() {
        return idExamen;
    }

    public void setIdExamen(int idExamen) {
        this.idExamen = idExamen;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        if (calificacion < 0 || calificacion > 20) {
            throw new IllegalArgumentException("La calificación debe estar entre 0 y 20.");
        }
        this.calificacion = calificacion;
    }

}

