public class Persona {
    protected String nombre;
    protected int edad;

    public Persona (String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getInfo () {
        return "Nombre: " + nombre + ", Edad: " + edad;
    }
}