import ec.edu.uce.dominio.PreguntaBase;
import ec.edu.uce.dominio.Simulador;

public class TestSimulador {
    public static void main(String[] args) {
        testConstructorConParametros();
        testSetters();
    }

    // Test del constructor con parámetros
    private static void testConstructorConParametros() {
        System.out.println("Prueba del constructor con parámetros:");

        // Creando un arreglo de preguntas base para el simulador
        PreguntaBase[] preguntasBase = {new PreguntaBase("¿Cuál es la capital de España?"), new PreguntaBase("¿Cuántos continentes hay?")};

        // Creando un simulador con parámetros
        Simulador simulador = new Simulador(1, "Geografía", preguntasBase);

        if (simulador.getIdSimulador() == 1 &&
                simulador.getAsignatura().equals("Geografía") &&
                simulador.getPreguntasBase().length == 2) {
            System.out.println("Constructor con parámetros: PASADO");
        } else {
            System.out.println("Constructor con parámetros: FALLIDO");
        }

        System.out.println();
    }

    // Test de los setters
    private static void testSetters() {
        System.out.println("Prueba de setters:");

        // Creando un arreglo de preguntas base para el simulador
        PreguntaBase[] preguntasBase = {new PreguntaBase("¿Cuál es la capital de Francia?")};

        // Creando un simulador con parámetros
        Simulador simulador = new Simulador(1, "Historia", preguntasBase);

        // Probando el setter de idSimulador
        simulador.setIdSimulador(2);
        if (simulador.getIdSimulador() == 2) {
            System.out.println("Setter de idSimulador: PASADO");
        } else {
            System.out.println("Setter de idSimulador: FALLIDO");
        }

        // Probando el setter de asignatura
        simulador.setAsignatura("Matemáticas");
        if (simulador.getAsignatura().equals("Matemáticas")) {
            System.out.println("Setter de asignatura: PASADO");
        } else {
            System.out.println("Setter de asignatura: FALLIDO");
        }

        // Probando el setter de preguntasBase
        PreguntaBase[] nuevasPreguntas = {new PreguntaBase("¿Cuántos planetas hay en el sistema solar?")};
        simulador.setPreguntasBase(nuevasPreguntas);
        if (simulador.getPreguntasBase().length == 1 &&
                simulador.getPreguntasBase()[0].getPregunta().equals("¿Cuántos planetas hay en el sistema solar?")) {
            System.out.println("Setter de preguntasBase: PASADO");
        } else {
            System.out.println("Setter de preguntasBase: FALLIDO");
        }

        System.out.println();
    }
}
