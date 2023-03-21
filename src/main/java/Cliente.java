public class Cliente extends Persona{
    //Constructor
    public Cliente(String nombre, String rut) {
        super(nombre,rut);
    }

    //Metodos
    public String getTipo() {
        return "Cliente";
    }

}
