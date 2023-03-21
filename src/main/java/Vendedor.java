public class Vendedor extends Persona {
    //Constructor
    public Vendedor(String nombre, String rut) {
        super(nombre,rut);
    }

    //Metodos
    public String getTipo() {
        return "Vendedor";
    }
}
