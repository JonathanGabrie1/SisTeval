import ec.edu.uce.dominio.*;

public class TestCentroEstudiantil {
    public static void main(String[] args) {
        // 1. Crear arreglos válidos con datos simulados
        Usuario[] usuarios = new Usuario[3];
        MaterialDeEstudio[] materiales = new MaterialDeEstudio[2];
        Simulador[] simuladores = new Simulador[1];
        Examen[] examenes = new Examen[2];

        // Crear usuarios
        for (int i = 0; i < usuarios.length; i++) {
            usuarios[i] = new Usuario("Usuario" + (i + 1), "usuario" + (i + 1) + "@example.com", "contraseña123", "Estudiante");
        }

        // Crear materiales de estudio
        for (int i = 0; i < materiales.length; i++) {
            materiales[i] = new MaterialDeEstudio(i+1,"ciencias","anatomia","naturales");
        }

        // Crear simuladores
        //for (int i = 0; i < simuladores.length; i++) {
        //    simuladores[i] = new Simulador(i + 1, "Simulador de " + (i + 1),);
        //}

        // Crear exámenes
        //for (int i = 0; i < examenes.length; i++) {
        //    examenes[i] = new Examen("examen", i+1, "mate",i+1);
        //}

        // 2. Crear una instancia de CentroEstudiantil con datos válidos
        CentroEstudiantil centro = new CentroEstudiantil(usuarios, materiales, simuladores, examenes);

        // 3. Pruebas con métodos get
        System.out.println("Usuarios:");
        for (Usuario u : centro.getUsuarios()) {
            System.out.println(u.getNombre());
        }

        System.out.println("\nMateriales de Estudio:");
        for (MaterialDeEstudio m : centro.getMaterialesDeEstudio()) {
            System.out.println(m.getTitulo());
        }

//        System.out.println("\nSimuladores:");
//        for (Simulador s : centro.getSimuladores()) {
//            System.out.println(s.getAsignatura());
//        }
//
//        System.out.println("\nExámenes:");
//        for (Examen e : centro.getExamenes()) {
//            System.out.println(e.getNombre());
//        }

        // 4. Pruebas con métodos set y validaciones
        System.out.println("\nProbando validaciones de límites...");
        try {
            // Intentar agregar más de 40 usuarios
            Usuario[] usuariosExceso = new Usuario[41]; // Este debería fallar
            for (int i = 0; i < usuariosExceso.length; i++) {
                usuariosExceso[i] = new Usuario("UsuarioExceso" + (i + 1), "usuarioExceso" + (i + 1) + "@example.com", "contraseña123", "Estudiante");
            }
            // Intentar establecer más de 40 usuarios
            CentroEstudiantil centroExceso = new CentroEstudiantil();
            centroExceso.setUsuarios(usuariosExceso);  // Esto lanzará una excepción
            System.out.println("Se crearon más de 40 usuarios, lo cual no debería ser posible.");
        } catch (IllegalArgumentException e) {
            System.out.println("Error esperado: " + e.getMessage());
        }

        // Cambiar datos válidos
        Usuario[] nuevosUsuarios = new Usuario[2];
        for (int i = 0; i < nuevosUsuarios.length; i++) {
            nuevosUsuarios[i] = new Usuario("NuevoUsuario" + (i + 1), "nuevo" + (i + 1) + "@example.com", "nuevaContraseña123", "Estudiante");
        }

        // Establecer los nuevos usuarios
        CentroEstudiantil centroModificado = new CentroEstudiantil();
        centroModificado.setUsuarios(nuevosUsuarios);

        System.out.println("\nUsuarios después del cambio:");
        for (Usuario u : centroModificado.getUsuarios()) {
            System.out.println(u.getNombre());
        }
    }
}


