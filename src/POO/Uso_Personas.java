package POO;

public class Uso_Personas {
    public static void main(String[] args){
        Persona[] lasPersonas=new Persona [2];

        lasPersonas[0]=new Empleado("Ameyali", 5000);
        lasPersonas[1]=new Alumno("Alfonso", "Programación");

        for (Persona p:lasPersonas) {
            System.out.println(p.dameNombre() + ", " + p.dameDescripcion() );
        }
    }
}

abstract class Persona{
    private String nombre;
    public Persona(String nom){
        nombre=nom;
    }
    public String dameNombre(){
        return nombre;
    }
    public abstract String dameDescripcion();
}
class Empleado extends Persona{
    private String nombre;
    private double sueldo;
    public Empleado(String nom, double sue){
        super(nom);
        sueldo=sue;
    }

    public String dameDescripcion(){
        return "El empleado tiene un sueldo de: " + sueldo;
    }
    public double dameSueldo(){

        return sueldo;
    }
}
class Alumno extends Persona{
    private String carrera;
    public  Alumno (String nom, String car){
        super(nom);
        carrera=car;
    }
    public String dameDescripcion(){
        return "Este alumno está estudiando la carrera de: " + carrera;
    }
}