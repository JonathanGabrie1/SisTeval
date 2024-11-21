package ec.edu.uce.dominio;

public class Docente extends Usuario {
    private String asignatura;
    private Examen[] examenesCreados;
    private Simulador[] simuladoresCreados;

    // Constructor por defecto
    public Docente() {
        super(); // Llama al constructor por defecto de Usuario
        this.asignatura = "Sin asignatura";
        this.examenesCreados = new Examen[0];
        this.simuladoresCreados = new Simulador[0];
    }

    // Constructor con parámetros
    public Docente(String nombre, String email, String contraseña, String tipoUsuario, String asignatura) {
        this(); // Llama al constructor por defecto
        setNombre(nombre); // Asigna valores usando los métodos heredados
        setEmail(email);
        setContraseña(contraseña);
        setTipoUsuario(tipoUsuario);
        setAsignatura(asignatura);
    }

    // Getter y Setter de asignatura
    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        if (asignatura == null || asignatura.trim().isEmpty()) {
            throw new IllegalArgumentException("La asignatura no puede estar vacía.");
        }
        this.asignatura = asignatura;
    }

    // Métodos para examenesCreados
    public Examen[] getExamenesCreados() {
        return examenesCreados;
    }

    public void crearExamen(Examen examen) {
        if (examen == null) {
            throw new IllegalArgumentException("El examen no puede ser nulo.");
        }
        Examen[] nuevoArray = new Examen[examenesCreados.length + 1];
        System.arraycopy(examenesCreados, 0, nuevoArray, 0, examenesCreados.length);
        nuevoArray[examenesCreados.length] = examen;
        examenesCreados = nuevoArray;
    }

    public void editarExamen(int indice, Examen examenNuevo) {
        if (examenNuevo == null) {
            throw new IllegalArgumentException("El examen no puede ser nulo.");
        }
        if (indice < 0 || indice >= examenesCreados.length) {
            throw new IndexOutOfBoundsException("Índice de examen no válido.");
        }
        examenesCreados[indice] = examenNuevo;
    }

    public void eliminarExamen(int indice) {
        if (indice < 0 || indice >= examenesCreados.length) {
            throw new IndexOutOfBoundsException("Índice de examen no válido.");
        }
        Examen[] nuevoArray = new Examen[examenesCreados.length - 1];
        System.arraycopy(examenesCreados, 0, nuevoArray, 0, indice);
        System.arraycopy(examenesCreados, indice + 1, nuevoArray, indice, examenesCreados.length - indice - 1);
        examenesCreados = nuevoArray;
    }

    // Métodos para simuladoresCreados
    public Simulador[] getSimuladoresCreados() {
        return simuladoresCreados;
    }

    public void agregarSimulador(Simulador simulador) {
        if (simulador == null) {
            throw new IllegalArgumentException("El simulador no puede ser nulo.");
        }
        Simulador[] nuevoArray = new Simulador[simuladoresCreados.length + 1];
        System.arraycopy(simuladoresCreados, 0, nuevoArray, 0, simuladoresCreados.length);
        nuevoArray[simuladoresCreados.length] = simulador;
        simuladoresCreados = nuevoArray;
    }

    public void eliminarSimulador(int indice) {
        if (indice < 0 || indice >= simuladoresCreados.length) {
            throw new IndexOutOfBoundsException("Índice de simulador no válido.");
        }
        Simulador[] nuevoArray = new Simulador[simuladoresCreados.length - 1];
        System.arraycopy(simuladoresCreados, 0, nuevoArray, 0, indice);
        System.arraycopy(simuladoresCreados, indice + 1, nuevoArray, indice, simuladoresCreados.length - indice - 1);
        simuladoresCreados = nuevoArray;
    }
}
