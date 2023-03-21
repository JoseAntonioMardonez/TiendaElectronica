public abstract class Persona {
    //Atributos
    private String nombre;
    private String rut;

    //Constructor
    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    //Metodos
    public abstract String getTipo();

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRut() {
        return this.rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
}
