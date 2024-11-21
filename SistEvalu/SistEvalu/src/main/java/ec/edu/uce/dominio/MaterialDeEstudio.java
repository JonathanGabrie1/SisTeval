package ec.edu.uce.dominio;

public class MaterialDeEstudio {

    // Atributos
    private int idMaterial;
    private String titulo;
    private String contenido;
    private String materia;

    // Constructor por defecto
    public MaterialDeEstudio() {
        this.idMaterial = 0; // Valor predeterminado
        this.titulo = "Sin título";
        this.contenido = "Sin contenido";
        this.materia = "Sin materia";
    }

    // Constructor con parámetros
    public MaterialDeEstudio(int idMaterial, String titulo, String contenido, String materia) {
        setIdMaterial(idMaterial);
        setTitulo(titulo);
        setContenido(contenido);
        setMateria(materia);
    }

    // Métodos get y set
    public int getIdMaterial() {
        return idMaterial;
    }

    public void setIdMaterial(int idMaterial) {
        if (idMaterial <= 0) {
            throw new IllegalArgumentException("El idMaterial debe ser un número entero positivo.");
        }
        this.idMaterial = idMaterial;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El título no debe estar vacío.");
        }
        this.titulo = titulo;
    }

    public String getContenido() {
        return contenido;
    }

    public void setContenido(String contenido) {
        if (contenido == null || contenido.trim().isEmpty()) {
            throw new IllegalArgumentException("El contenido no debe estar vacío.");
        }
        this.contenido = contenido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        if (materia == null || materia.trim().isEmpty()) {
            throw new IllegalArgumentException("La materia no debe estar vacía.");
        }
        this.materia = materia;
    }

    // Métodos adicionales para gestión CRUD

    public void actualizarContenido(String nuevoContenido) {
        if (nuevoContenido == null || nuevoContenido.trim().isEmpty()) {
            throw new IllegalArgumentException("El contenido no debe estar vacío.");
        }
        setContenido(nuevoContenido);
    }

    public void actualizarTitulo(String nuevoTitulo) {
        setTitulo(nuevoTitulo);
    }

    public void actualizarMateria(String nuevaMateria) {
        setMateria(nuevaMateria);
    }

    // Método toString para visualización
    @Override
    public String toString() {
        return "MaterialDeEstudio{" +
                "idMaterial=" + idMaterial +
                ", titulo='" + titulo + '\'' +
                ", contenido='" + contenido + '\'' +
                ", materia='" + materia + '\'' +
                '}';
    }
}
