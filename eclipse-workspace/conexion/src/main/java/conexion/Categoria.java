package conexion;

public class Categoria {
    private String categoria;
    private String descripcion;

    // Constructor, getters y setters
    public Categoria(String categoria, String descripcion) {
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}