import ec.edu.uce.dominio.MaterialDeEstudio;

public class TestMaterialDeEstudio {
    public static void main(String[] args) {
        // Prueba de creación del objeto
        try {
            MaterialDeEstudio material = new MaterialDeEstudio(1, "Introducción a Java", "Contenido de introducción", "Programación");

            // Pruebas de atributos iniciales
            if (material.getIdMaterial() == 1) {
                System.out.println("Prueba de idMaterial: Correcto");
            } else {
                System.out.println("Prueba de idMaterial: Incorrecto");
            }

            if ("Introducción a Java".equals(material.getTitulo())) {
                System.out.println("Prueba de título: Correcto");
            } else {
                System.out.println("Prueba de título: Incorrecto");
            }

            if ("Contenido de introducción".equals(material.getContenido())) {
                System.out.println("Prueba de contenido: Correcto");
            } else {
                System.out.println("Prueba de contenido: Incorrecto");
            }

            if ("Programación".equals(material.getMateria())) {
                System.out.println("Prueba de materia: Correcto");
            } else {
                System.out.println("Prueba de materia: Incorrecto");
            }

            // Prueba de setIdMaterial con valor válido
            try {
                material.setIdMaterial(2);
                if (material.getIdMaterial() == 2) {
                    System.out.println("Prueba de setIdMaterial con valor válido: Correcto");
                } else {
                    System.out.println("Prueba de setIdMaterial con valor válido: Incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error inesperado al establecer idMaterial: " + e.getMessage());
            }

            // Prueba de setIdMaterial con valor inválido
            try {
                material.setIdMaterial(0);
                System.out.println("Prueba de setIdMaterial con valor inválido: Incorrecto (debería lanzar excepción)");
            } catch (IllegalArgumentException e) {
                System.out.println("Prueba de setIdMaterial con valor inválido: Correcto (se lanzó excepción)");
            }

            // Prueba de setTitulo con valor válido
            try {
                material.setTitulo("Conceptos Avanzados");
                if ("Conceptos Avanzados".equals(material.getTitulo())) {
                    System.out.println("Prueba de setTitulo con valor válido: Correcto");
                } else {
                    System.out.println("Prueba de setTitulo con valor válido: Incorrecto");
                }
            } catch (Exception e) {
                System.out.println("Error inesperado al establecer título: " + e.getMessage());
            }

            // Prueba de setTitulo con valor inválido
            try {
                material.setTitulo("");
                System.out.println("Prueba de setTitulo con valor inválido: Incorrecto (debería lanzar excepción)");
            } catch (IllegalArgumentException e) {
                System.out.println("Prueba de setTitulo con valor inválido: Correcto (se lanzó excepción)");
            }

            // Prueba de setContenido
            material.setContenido("Contenido avanzado");
            if ("Contenido avanzado".equals(material.getContenido())) {
                System.out.println("Prueba de setContenido: Correcto");
            } else {
                System.out.println("Prueba de setContenido: Incorrecto");
            }

            // Prueba de setMateria
            material.setMateria("Ciencia de Datos");
            if ("Ciencia de Datos".equals(material.getMateria())) {
                System.out.println("Prueba de setMateria: Correcto");
            } else {
                System.out.println("Prueba de setMateria: Incorrecto");
            }

        } catch (Exception e) {
            System.out.println("Error al crear el MaterialDeEstudio: " + e.getMessage());
        }
    }
}
