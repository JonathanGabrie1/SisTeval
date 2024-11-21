package ec.edu.uce.consola.gui;
import java.util.Scanner;

public class MenuSistEval {

    private final Scanner teclado = new Scanner(System.in);
    private final SubMenuUsuario subMenuUsuario;
    private final SubMenuSimulacro subMenuSimulacro;
    private final SubMenuExamen subMenuExamen;
    private final SubMenuMaterial SubMenuMaterial;
    private final SubMenuSesiones SubMenuSesiones;

    public MenuSistEval() {
        this.subMenuSimulacro = new SubMenuSimulacro();
        this.subMenuUsuario = new SubMenuUsuario();
        this.subMenuExamen = new SubMenuExamen();
        this.SubMenuMaterial = new SubMenuMaterial();
        this.SubMenuSesiones = new SubMenuSesiones();

    }

    void MenuSistEval() {
        int opcion;

        do {
            System.out.println("====================================");
            System.out.println("             ¡SISTEVAL¡");
            System.out.println("====================================");
            System.out.println("¿que desea hacer hoy?");
            System.out.println("1. Gestionar Perfil");
            System.out.println("2. Gestionar Examen");
            System.out.println("3. Gestionar Simulacros");
            System.out.println("4. Gestionar Material de estudio");
            System.out.println("5. Gestionar Sesiones De Examen");
            System.out.println("6. salir");
            System.out.println("====================================");
            System.out.print("Seleccione una opción (1-6): ");

            while (!teclado.hasNextInt()) {
                System.out.println("Por favor ingrese un numero valido");
                teclado.next();
            }
            opcion = teclado.nextInt();
            teclado.nextLine(); // Limpiar el buffer de entrada

            switch (opcion) {
                case 1:
                    subMenuUsuario.procesarOpcionUsuario();
                    break;
                case 2:
                    subMenuExamen.procesarOpcionExamen();
                    break;
                case 3:
                    subMenuSimulacro.procesarOpcionSimulacro();
                    break;
                case 5:
                    SubMenuSesiones.procesarOpcionSesion();
                    break;
                case 4:
                    SubMenuMaterial.procesarOpcionMaterial();
                    break;
                case 6:
                    System.out.println("Saliendo del programa");
                break;
                default:
                    System.out.println("Opcion no valida");
                    break;
            }

        } while (opcion != 6);
    }
    //Método que da paso al menu de sisteval.
    public static void main(String[] args) {
        new MenuSistEval();
    }
}
