package POO;

public class Uso_Personas {
    public static void main(String[] args){


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



