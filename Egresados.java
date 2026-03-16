public class Egresados extends Persona {
    private String carrera;
    private int fechagrad;

    public Egresados (String nombre, int edad, String carrera, int fechagrad){
    super (nombre, edad );
    this.carrera = carrera;
    this.fechagrad = fechagrad;
    }
      public String getInfo () {
        return super.getInfo () + ", Carrera : " + carrera + ", Año graduado: " + fechagrad;
    }
}
