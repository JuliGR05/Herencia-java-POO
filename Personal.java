public class Personal extends Persona {
    private String cargo;
    private String turno;

    public Personal (String nombre, int edad, String cargo, String turno){
    super (nombre, edad );
    this.cargo = cargo;
    this.turno = turno;
    }
      public String getInfo () {
        return super.getInfo () + ", Cargo : " + cargo + ", Turno: " + turno;
    }
    }