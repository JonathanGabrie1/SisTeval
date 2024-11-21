package ec.edu.uce.dominio;

public class CentroEstudiantil {

    // Atributos
    private Usuario[] usuarios;
    private MaterialDeEstudio[] materialesDeEstudio;
    private Simulador[] simuladores;
    private Examen[] examenes;
    private final int LIMITE_MAXIMO = 40; // Límite máximo manejable

    // Constructor
    public CentroEstudiantil(Usuario[] usuarios, MaterialDeEstudio[] materialesDeEstudio,
                             Simulador[] simuladores, Examen[] examenes) {
        setUsuarios(usuarios);
        setMaterialesDeEstudio(materialesDeEstudio);
        setSimuladores(simuladores);
        setExamenes(examenes);
    }

    // Métodos get y set
    public Usuario[] getUsuarios() {
        return usuarios;
    }

    public void setUsuarios(Usuario[] usuarios) {
        if (usuarios == null || usuarios.length > LIMITE_MAXIMO) {
            throw new IllegalArgumentException("El arreglo de usuarios es inválido o excede el límite permitido.");
        }
        this.usuarios = usuarios;
    }

    public MaterialDeEstudio[] getMaterialesDeEstudio() {
        return materialesDeEstudio;
    }

    public void setMaterialesDeEstudio(MaterialDeEstudio[] materialesDeEstudio) {
        if (materialesDeEstudio == null || materialesDeEstudio.length > LIMITE_MAXIMO) {
            throw new IllegalArgumentException("El arreglo de materiales es inválido o excede el límite permitido.");
        }
        this.materialesDeEstudio = materialesDeEstudio;
    }

    public Simulador[] getSimuladores() {
        return simuladores;
    }

    public void setSimuladores(Simulador[] simuladores) {
        if (simuladores == null || simuladores.length > LIMITE_MAXIMO) {
            throw new IllegalArgumentException("El arreglo de simuladores es inválido o excede el límite permitido.");
        }
        this.simuladores = simuladores;
    }

    public Examen[] getExamenes() {
        return examenes;
    }

    public void setExamenes(Examen[] examenes) {
        if (examenes == null || examenes.length > LIMITE_MAXIMO) {
            throw new IllegalArgumentException("El arreglo de exámenes es inválido o excede el límite permitido.");
        }
        this.examenes = examenes;
    }

    // Validaciones de nombre y ubicación
    public static void validarNombreYUbicacion(String nombre, String ubicacion) {
        if (nombre == null || nombre.isEmpty()) {
            throw new IllegalArgumentException("El nombre no debe estar vacío.");
        }
        if (ubicacion == null || ubicacion.isEmpty()) {
            throw new IllegalArgumentException("La ubicación no debe estar vacía.");
        }
    }
}
