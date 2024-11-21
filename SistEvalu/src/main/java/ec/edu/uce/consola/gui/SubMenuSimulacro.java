package ec.edu.uce.consola.gui;

import java.util.Scanner;

public class SubMenuSimulacro {
    private final Scanner scanner = new Scanner(System.in);
    public void mostrarSubMenuSimulacro() {
        System.out.println("------------------------------");
        System.out.println("   Simulacros del Examen      ");
        System.out.println("------------------------------");
        System.out.println("1. Crear Simulacro");
        System.out.println("2. Modificar Simulacro");
        System.out.println("3. Eliminar Simulacro");
        System.out.println("4. Consultar Simulacro");
        System.out.println("5. Volver al Menu Principal");
        System.out.println("------------------------------");
        System.out.print("Ingresa la opcion deseada: ");
    }

    public void procesarOpcionSimulacro() {
        Scanner sc = new Scanner(System.in);
        int opcion = -1;
        do {
            mostrarSubMenuSimulacro();
            while (!sc.hasNextInt()) {
                System.out.println("Opcion no valida. Por favor ingrese un numero entero positivo.");
                sc.next();
                mostrarSubMenuSimulacro();
            }
            opcion = sc.nextInt();
            if (opcion <= 0) {
                System.out.println("Opcion no valida. Por favor ingrese un numero entero positivo.");
                continue;
            }
            sc.nextLine();

            switch (opcion) {
                case 1:
                    //crearSimulacro();
                    break;
                case 2:
                    //modificarSimulacro();
                    break;
                case 3:
                    //eliminarSimulacro();
                    break;
                case 4:
                    //ConsultarSimulacro();
                    break;
                case 5:
                    System.out.println("Volviendo al Menu SistEval");
                    break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }
        } while (opcion != 5);
    }
    //cruds
}
