public class Estudiante extends Persona {
    private String carrera;
    private int carnet;

    public Estudiante (String nombre, int edad, String carrera, int carnet) {
        super (nombre,edad);
        this.carrera = carrera;
        this.carnet = carnet;
    }

    public String getInfo () {
        return super.getInfo () + ", Carrera: " + carrera + ", Carnet: " + carnet;
    }
    }
