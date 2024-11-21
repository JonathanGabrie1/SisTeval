package ec.edu.uce.dominio;

import java.util.Arrays;

import java.util.Arrays;

public class SesionExamen {

    // Atributos
    private float calificacion;
    private int idSesion;
    private Examen examen;
    private int[] calificaciones;
    private boolean sesionActiva; // Estado de la sesión

    // Constructor
    public SesionExamen(int idSesion, Examen examen, int[] calificaciones) {
        setIdSesion(idSesion);
        setExamen(examen);
        setCalificaciones(calificaciones);
        this.sesionActiva = false; // La sesión inicia como inactiva
        this.calificacion = 0.0f; // Inicializar calificación en 0 por defecto
    }

    // Métodos get y set
    public float getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(float calificacion) {
        if (calificacion < 0 || calificacion > 20) {
            throw new IllegalArgumentException("La calificación debe estar en el rango de 0 a 20.");
        }
        this.calificacion = calificacion;
    }

    public int getIdSesion() {
        return idSesion;
    }

    public void setIdSesion(int idSesion) {
        if (idSesion <= 0) {
            throw new IllegalArgumentException("El idSesion debe ser un número entero positivo.");
        }
        this.idSesion = idSesion;
    }

    public Examen getExamen() {
        return examen;
    }

    public void setExamen(Examen examen) {
        if (examen == null) {
            throw new IllegalArgumentException("El examen no debe ser nulo.");
        }
        this.examen = examen;
    }

    public int[] getCalificaciones() {
        return calificaciones;
    }

    public void setCalificaciones(int[] calificaciones) {
        if (calificaciones == null || calificaciones.length == 0) {
            throw new IllegalArgumentException("El arreglo de calificaciones no puede estar vacío.");
        }
        for (int cal : calificaciones) {
            if (cal < 0 || cal > 20) {
                throw new IllegalArgumentException("Todas las calificaciones deben estar en el rango de 0 a 20.");
            }
        }
        this.calificaciones = calificaciones;
    }

    // Métodos específicos de la sesión
    public void configurarSesion() {
        if (sesionActiva) {
            throw new IllegalStateException("No se puede configurar una sesión que ya está activa.");
        }
        sesionActiva = true;
        System.out.println("La sesión ha sido configurada y está activa.");
    }

    public void controlarAcceso() {
        if (!sesionActiva) {
            throw new IllegalStateException("No se puede acceder a una sesión inactiva.");
        }
        System.out.println("El acceso a la sesión está permitido.");
    }

    public void finalizarAcceso() {
        if (!sesionActiva) {
            throw new IllegalStateException("No se puede finalizar una sesión que no está activa.");
        }
        sesionActiva = false;
        System.out.println("La sesión ha sido finalizada.");
    }

    // Método para calcular la calificación final del examen (promedio de las calificaciones)
    public void calcularCalificacionFinal() {
        if (calificaciones == null || calificaciones.length == 0) {
            throw new IllegalStateException("No hay calificaciones disponibles para calcular.");
        }
        int suma = 0;
        for (int cal : calificaciones) {
            suma += cal;
        }
        this.calificacion = (float) suma / calificaciones.length;
        System.out.println("La calificación final es: " + this.calificacion);
    }

    // Método toString para mostrar el estado del objeto
    @Override
    public String toString() {
        return "SesionExamen{" +
                "idSesion=" + idSesion +
                ", calificacion=" + calificacion +
                ", sesionActiva=" + sesionActiva +
                ", calificaciones=" + Arrays.toString(calificaciones) +
                '}';
    }
}
