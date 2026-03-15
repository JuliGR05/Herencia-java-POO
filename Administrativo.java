public class Administrativo extends Persona {
    private String departamento;
    private String cargo;

    public Administrativo (String nombre, int edad, String departamento, String cargo) {
        super (nombre,edad);
        this.departamento = departamento;
        this.cargo = cargo;
    }

    public String getInfo () {
        return super.getInfo () + ", Departamento: " + departamento + ", Cargo: " + cargo;
    }
    }