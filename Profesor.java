public class Profesor extends Persona {
    private String facultad;
    private String titulo;

    public Profesor (String nombre, int edad, String facultad, String titulo){
    super (nombre, edad );
    this.facultad = facultad;
    this.titulo = titulo;
    }
      public String getInfo () {
        return super.getInfo () + ", Departamento : " + facultad + ", Título: " + titulo;
    }
    }