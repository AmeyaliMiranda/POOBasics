package POO;

public class Uso_Personas {
    public static void main(String[] args) {
        Persona[] personas = new Persona[2]; // Más entendible y simplificado

        personas[0] = new Empleado("Ameyali", 5000, "El payaso tiene un sueldo de: "); // Overriding polymorphism
        //personas[1] = new Alumno("Alfonso", "Programación"); // Overriding polymorphism

        // Utilizar la palabra reservada: this
        // Improve getter and setters (add more setters)
        // Add overloading polymorphism example
        // Change to english language
        // Review all IntelliJ corrections
        // Gitignore for Java

        for (Persona p : personas) {
            System.out.println(p.getNombre() + ", " + p.dameDescripcion());
        }
    }
}

abstract class Persona {
    private String nombre;
    String description;

    Persona(String nom, String description) {
        this.nombre = nom;
        this.description = description;
    }

    public String getNombre() {
        return nombre;
    }

    public abstract String dameDescripcion(); // Abstracta por definición, abstraemos la -implementación-

    public abstract void setDescription(String description);
}

class Empleado extends Persona {
    private double sueldo;

    Empleado(String nom, double sue, String customDescription) {
        super(nom, "El empleado tiene un sueldo de: ");
        this.sueldo = sue;
        this.description = customDescription;
    }

    public String dameDescripcion() {
        // Getter
        return description + sueldo;
    }

    @Override
    public void setDescription(String description) {
        // Setter
        this.description = description;
    }

    public double dameSueldo() {
        return sueldo;
    }
}

class Alumno extends Persona {
    private String carrera;

    public Alumno(String nom, String car) {
        super(nom, "Este alumno está estudiando la carrera de: ");
        carrera = car;
    }

    // This need to be changed
    public String dameDescripcion() {
        return "Este alumno está estudiando la carrera de: " + carrera;
    }

    @Override
    public void setDescription(String description) {
        // Setter
        this.description = description;
    }
}