import java.util.ArrayList;

public class Tienda {
    //Atributos
    public ArrayList<Producto> productos;
    public ArrayList<Venta> ventas;
    public ArrayList<Cliente> clientes;
    public ArrayList<Vendedor> vendedores;

    //Constructor
    public Tienda() {
        this.ventas = new ArrayList<Venta>();
        this.productos = new ArrayList<Producto>();
        this.clientes = new ArrayList<Cliente>();
        this.vendedores = new ArrayList<Vendedor>();
    }

    //Metodos
    public Producto buscarProductoPorNombre(String nombre){
        for(Producto producto : this.productos){
            if(producto.getNombre().equals(nombre)){
                return producto;
            }
        }
        return null;
    }

    public Producto buscarProductoPorCategoria(String categoria){
        for(Producto producto : this.productos){
            if(producto.getCategoria().equals(categoria)){
                return producto;
            }
        }
        return null;
    }
    public void agregarProducto(Producto producto) {
        this.productos.add(producto);
        System.out.println("Producto agregado");
    }

    public void eliminarProducto(Producto producto) {
        this.productos.remove(producto);
        System.out.println("Producto eliminado");
    }

    public void modificarProducto(){

    }

    public void mostrarProductos(){

    }

}
