public class Producto {
    //Atributos
    private String nombre;
    private int precio;
    private int stock;
    private String categoria;

    //Constructor
    public Producto(String nombre, int precio, String codigo, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    //Metodos
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio(){
        return this.precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getStock(){
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getCategoria(){
        return this.categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
