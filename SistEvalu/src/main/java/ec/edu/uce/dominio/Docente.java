package ec.edu.uce.dominio;
import java.util.ArrayList;

public class Docente extends Usuario {

    // Atributos
    private String asignatura;
    private ArrayList<Examen> examenesCreados;
    private ArrayList<Simulador> simuladoresCreados;

    // Constructor
    public Docente(String nombre, String email, String contraseña, String tipoUsuario, String asignatura) {
        super(nombre, email, contraseña, tipoUsuario); // Llamada al constructor de la clase base Usuario
        setAsignatura(asignatura);
        this.examenesCreados = new ArrayList<>();
        this.simuladoresCreados = new ArrayList<>();
    }

    // Métodos get y set
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        if (asignatura == null || asignatura.trim().isEmpty()) {
            throw new IllegalArgumentException("La especialidad no puede estar vacía.");
        }
        this.asignatura = asignatura;
    }

    public Examen[] getExamenesCreados() {
        return examenesCreados.toArray(new Examen[0]);
    }

    public void setExamenesCreados(Examen[] examenesCreados) {
        if (examenesCreados != null) {
            this.examenesCreados.clear();
            for (Examen examen : examenesCreados) {
                this.examenesCreados.add(examen);
            }
        }
    }

    public Simulador[] getSimuladoresCreados() {
        return simuladoresCreados.toArray(new Simulador[0]);
    }

    public void setSimuladoresCreados(Simulador[] simuladoresCreados) {
        if (simuladoresCreados != null) {
            this.simuladoresCreados.clear();
            for (Simulador simulador : simuladoresCreados) {
                this.simuladoresCreados.add(simulador);
            }
        }
    }

    // Métodos adicionales
    public void crearExamen(Examen examen) {
        if (examen != null) {
            examenesCreados.add(examen);
            System.out.println("Examen creado: " + examen.getIdExamen());
        } else {
            throw new IllegalArgumentException("El examen no puede ser nulo.");
        }
    }

    public void editarExamen(int indice, Examen examen) {
        if (indice >= 0 && indice < examenesCreados.size()) {
            examenesCreados.set(indice, examen);
            System.out.println("Examen editado: " + examen.getIdExamen());
        } else {
            throw new IllegalArgumentException("Índice de examen inválido.");
        }
    }

    public Examen consultarExamen(int indice) {
        if (indice >= 0 && indice < examenesCreados.size()) {
            return examenesCreados.get(indice);
        } else {
            throw new IllegalArgumentException("Índice de examen inválido.");
        }
    }

    public void eliminarExamen(int indice) {
        if (indice >= 0 && indice < examenesCreados.size()) {
            Examen examenEliminado = examenesCreados.remove(indice);
            System.out.println("Examen eliminado: " + examenEliminado.getIdExamen());
        } else {
            throw new IllegalArgumentException("Índice de examen inválido.");
        }
    }

    public void agregarCalificacion(int indice, double calificacion) {
        if (indice >= 0 && indice < examenesCreados.size()) {
            Examen examen = examenesCreados.get(indice);
            // Suponiendo que la calificación está en el rango de 0 a 20
            if (calificacion < 0 || calificacion > 20) {
                throw new IllegalArgumentException("La calificación debe estar entre 0 y 20.");
            }
            examen.setCalificacion((float) calificacion);
            System.out.println("Calificación agregada al examen " + examen.getIdExamen() + ": " + calificacion);
        } else {
            throw new IllegalArgumentException("Índice de examen inválido.");
        }
    }
}