package ec.edu.uce.dominio;

import java.util.HashSet;

public class Estudiante extends Usuario {

    // Atributos
    private String matricula;
    private Simulador[] simuladoresRealizados;
    private int[] calificaciones;
    private static HashSet<String> matriculasExistentes = new HashSet<>(); // Para verificar unicidad de la matrícula

    // Constructor
    public Estudiante(String nombre, String email, String contraseña, String tipoUsuario, String matricula, Simulador[] simuladoresRealizados, int[] calificaciones) {
        super(nombre, email, contraseña, tipoUsuario); // Llamada al constructor de la clase base Usuario
        setMatricula(matricula);
        setSimuladoresRealizados(simuladoresRealizados);
        setCalificaciones(calificaciones);
    }

    // Métodos get y set
    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("La matrícula no puede estar vacía.");
        }
        if (matriculasExistentes.contains(matricula)) {
            throw new IllegalArgumentException("La matrícula debe ser única.");
        }
        matriculasExistentes.add(matricula);
        this.matricula = matricula;
    }

    public Simulador[] getSimuladoresRealizados() {
        return simuladoresRealizados;
    }

    public void setSimuladoresRealizados(Simulador[] simuladoresRealizados) {
        this.simuladoresRealizados = simuladoresRealizados;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        if (calificaciones == null || calificaciones.length == 0) {
            throw new IllegalArgumentException("Las calificaciones no pueden estar vacías.");
        }
        for (int cal : calificaciones) {
            if (cal < 0 || cal > 20) {
                throw new IllegalArgumentException("Las calificaciones deben estar en el rango de 0 a 20.");
            }
        }
        this.calificaciones = calificaciones;
    }
}
