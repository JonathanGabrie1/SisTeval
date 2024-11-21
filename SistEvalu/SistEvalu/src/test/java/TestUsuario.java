import ec.edu.uce.dominio.Usuario;

public class TestUsuario {

    public static void main(String[] args) {
        testConstructorConParametros();
        testSetters();
        testValidarUsuario();
        testEmailInvalido();
        testContraseñaInvalida();
    }

    private static void testConstructorConParametros() {
        System.out.println("Prueba del constructor con parámetros:");

        Usuario usuario = new Usuario("Juan Perez", "juan.perez@example.com", "password123", "Estudiante");

        if (usuario.getNombre().equals("Juan Perez") &&
                usuario.getEmail().equals("juan.perez@example.com") &&
                usuario.getContraseña().equals("password123") &&
                usuario.getTipoUsuario().equals("Estudiante")) {
            System.out.println("Constructor con parámetros: PASADO");
        } else {
            System.out.println("Constructor con parámetros: FALLIDO");
        }

        System.out.println();
    }

    private static void testSetters() {
        System.out.println("Prueba de setters:");

        Usuario usuario = new Usuario("Ana Lopez", "ana.lopez@example.com", "Ana2023*", "Administrador");

        // Probamos los setters
        usuario.setNombre("Carlos Ramirez");
        usuario.setEmail("carlos.ramirez@example.com");
        usuario.setContraseña("Carlos2024!");
        usuario.setTipoUsuario("Docente");

        boolean nombreCorrecto = usuario.getNombre().equals("Carlos Ramirez");
        boolean emailCorrecto = usuario.getEmail().equals("carlos.ramirez@example.com");
        boolean contraseñaCorrecta = usuario.getContraseña().equals("Carlos2024!");
        boolean tipoUsuarioCorrecto = usuario.getTipoUsuario().equals("Docente");

        if (nombreCorrecto && emailCorrecto && contraseñaCorrecta && tipoUsuarioCorrecto) {
            System.out.println("Setters: PASADO");
        } else {
            System.out.println("Setters: FALLIDO");
        }

        System.out.println();
    }

    private static void testValidarUsuario() {
        System.out.println("Prueba de validar usuario:");

        Usuario usuario = new Usuario("Luis Ortega", "luis.ortega@example.com", "Luis12345", "Estudiante");

        boolean validacionCorrecta = usuario.validarUsuario("luis.ortega@example.com", "Luis12345");
        boolean validacionIncorrecta = usuario.validarUsuario("luis.ortega@example.com", "ContraseñaIncorrecta");

        if (validacionCorrecta && !validacionIncorrecta) {
            System.out.println("Validación de usuario: PASADO");
        } else {
            System.out.println("Validación de usuario: FALLIDO");
        }

        System.out.println();
    }

    private static void testEmailInvalido() {
        System.out.println("Prueba de email inválido:");

        Usuario usuario;
        boolean esEmailValido = true;

        String emailInvalido = "email Invalido";
        if (emailInvalido.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            usuario = new Usuario("Miles Morales", emailInvalido, "Miles2024*", "Estudiante");
        } else {
            esEmailValido = false;
        }

        if (!esEmailValido) {
            System.out.println("Email inválido: PASADO");
        } else {
            System.out.println("Email inválido: FALLIDO");
        }

        System.out.println();
    }

    private static void testContraseñaInvalida() {
        System.out.println("Prueba de contraseña inválida:");

        Usuario usuario;
        boolean esContraseñaValida = true;

        String contraseñaInvalida = "La contraseña es demasiado corta, ingrese una contraseña valida";
        if (contraseñaInvalida.matches("^(?=.*[0-9]).{8,}$")) {
            usuario = new Usuario("Maria Delgado", "maria.delgado@example.com", contraseñaInvalida, "Estudiante");
        } else {
            esContraseñaValida = false;
        }

        if (!esContraseñaValida) {
            System.out.println("Contraseña inválida: PASADO");
        } else {
            System.out.println("Contraseña inválida: FALLIDO");
        }

        System.out.println();



        ///*
        // corregir los test de usuario, docente, simulador y revisar el arreglo de pregunta (constructor con parametro)
        //

    }
}