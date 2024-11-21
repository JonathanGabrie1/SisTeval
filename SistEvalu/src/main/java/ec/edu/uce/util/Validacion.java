package ec.edu.uce.util;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validacion {

    //valida usuario de 5-20 caracteres
    public static boolean validarNombres(String nombreUsuario) {
        String usuarioPattern = "^[a-zA-Z0-9_ ]{5,20}$";
        Pattern pattern = Pattern.compile(usuarioPattern);
        Matcher matcher = pattern.matcher(nombreUsuario);
        return matcher.matches();
    }

    // valida contraseña Al menos 6 caracteres, con una letra y un número
    public static boolean validarContrasena(String contraseña) {
        // Verificar que la longitud sea al menos 6 caracteres
        if (contraseña.length() < 6) {
            return false;
        }
        // Verificar que contenga al menos un número
        if (!contraseña.matches(".*\\d.*")) {
            return false;
        }
        // Verificar que contenga al menos una letra
        if (!contraseña.matches(".*[a-zA-Z].*")) {
            return false;
        }
        // Si pasa todas las verificaciones, es válida
        return true;
    }

    // validacion
}
