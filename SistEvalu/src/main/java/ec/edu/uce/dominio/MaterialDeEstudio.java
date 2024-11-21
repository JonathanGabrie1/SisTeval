package ec.edu.uce.dominio;

public class MaterialDeEstudio {

    // Atributos
    private int idMaterial;
    private String titulo;
    private String contenido;
    private String materia;

    // Constructor
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
        this.contenido = contenido;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
}
