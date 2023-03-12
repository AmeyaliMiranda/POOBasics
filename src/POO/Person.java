package POO;
abstract class Person {
    private String name;
    private int age;
    String description;

    public Person (String name, int age){ //método constructor que devuelve dos parámetros
        this.name=name;
        this.age=age;
        this.description=description;

    }
    public String getName(){

        return name;
    }
    public int getAge(){

        return age;
    }
    public abstract void setDescription(String description);

    public abstract String getDescription();

}
