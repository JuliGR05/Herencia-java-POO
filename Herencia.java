public class Herencia {
    public static void main(String[] args) {
        
        Estudiante[] estudiantes = new Estudiante[10];
        Estudiante e1 = new Estudiante("Ditangello Tabares", 18, "Ingeniería de sistemas", 20137 );
        Estudiante e2 = new Estudiante("Gabriela Gutiérrez", 17, "Química", 20140);
        Estudiante e3 = new Estudiante("Camila Guzmán", 20, "Ingeniería industrial", 20254);
        Estudiante e4 = new Estudiante("Sergio Correa", 22, "Administración de empresas", 20184);
        Estudiante e5 = new Estudiante("Pedro Pascal", 18, "Cine y televisión", 20859);
        Estudiante e6 = new Estudiante("Alejandra Caballero", 23, "Comunicación social y periodismo", 20341);
        Estudiante e7 = new Estudiante("Fernando Medicis", 24, "Ingeniería mecánica", 20471);
        Estudiante e8 = new Estudiante("William Castillo", 20, "Ingeniería electrónica", 20647);
        Estudiante e9 = new Estudiante("Johana Sierra", 17, "Licenciatura en pedagogía infantil", 20797);
        Estudiante e10 = new Estudiante("Germán Mendoza", 19, "Biología", 20254);

        //Para que estén dentro del arreglo
    estudiantes[0] = e1;
    estudiantes[1] = e2;
    estudiantes[2] = e3;
    estudiantes[3] = e4;
    estudiantes[4] = e5;
    estudiantes[5] = e6;
    estudiantes[6] = e7;
    estudiantes[7] = e8;
    estudiantes[8] = e9;
    estudiantes[9] = e10;


        Profesor p1 = new Profesor ("Ana Pérez", 22, "Ingeniería", "Ingeniero mecánico");
        Profesor p2 = new Profesor("Marta Nuñez", 35, "Ciencias y educación", "Licenciada en Física");

        Administrativo a1 = new Administrativo("Carlos Guzmán", 39, "Contabilidad", "Contador");
        Administrativo a2 = new Administrativo("Sara Lopez", 29, "Oficina asesora", "Asesora");

        System.out.println("\nLISTA ESTUDIANTES:");
            for(int i = 0; i < estudiantes.length; i++){
                System.out.println(estudiantes[i].getInfo());
        }
        
        System.out.println("\nLISTA PROFESORES");
        System.out.println(p1.getInfo());
        
        System.out.println("\nLISTA Admnistrativos");
        System.out.println(a1.getInfo());
        System.out.println(a2.getInfo());
    }

}