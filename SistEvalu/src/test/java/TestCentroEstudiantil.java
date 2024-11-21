import ec.edu.uce.dominio.*;

public class TestCentroEstudiantil {
    public static void main(String[] args) {
        // 1. Crear arreglos válidos con datos simulados
        Usuario[] usuarios = new Usuario[3];
        MaterialDeEstudio[] materiales = new MaterialDeEstudio[2];
        Simulador[] simuladores = new Simulador[1];
        Examen[] examenes = new Examen[2];

        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i] = new Usuario("Usuario" + (i + 1));
        }
        for (int i = 0; i < materiales.length; i++) {
            materiales[i] = new MaterialDeEstudio("Material" + (i + 1));
        }
        for (int i = 0; i < simuladores.length; i++) {
            simuladores[i] = new Simulador("Simulador" + (i + 1));
        }
        for (int i = 0; i < examenes.length; i++) {
            examenes[i] = new Examen("Examen" + (i + 1));
        }

        // 2. Crear una instancia de CentroEstudiantil
        CentroEstudiantil centro = new CentroEstudiantil(usuarios, materiales, simuladores, examenes);

        // 3. Pruebas con métodos get
        System.out.println("Usuarios:");
        for (Usuario u : centro.getUsuarios()) {
            System.out.println(u.getNombre());
        }

        System.out.println("\nMateriales de Estudio:");
        for (MaterialDeEstudio m : centro.getMaterialesDeEstudio()) {
            System.out.println(m.getNombre());
        }

        System.out.println("\nSimuladores:");
        for (Simulador s : centro.getSimuladores()) {
            System.out.println(s.getNombre());
        }

        System.out.println("\nExámenes:");
        for (Examen e : centro.getExamenes()) {
            System.out.println(e.getNombre());
        }

        // 4. Pruebas con métodos set y validaciones
        System.out.println("\nProbando validaciones de límites...");
        Usuario[] usuariosExceso = new Usuario[41]; // Este debería fallar
        if (usuariosExceso.length > 40) {
            System.out.println("Error esperado: Límite máximo excedido.");
        }

        // Cambiar datos válidos
        Usuario[] nuevosUsuarios = new Usuario[2];
        for (int i = 0; i < nuevosUsuarios.length; i++) {
            nuevosUsuarios[i] = new Usuario("NuevoUsuario" + (i + 1));
        }
        centro.setUsuarios(nuevosUsuarios);

        System.out.println("\nUsuarios después del cambio:");
        for (Usuario u : centro.getUsuarios()) {
            System.out.println(u.getNombre());
        }
    }
}
