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




