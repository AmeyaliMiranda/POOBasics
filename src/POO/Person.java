package POO;
abstract class Person {
    private String name;
    private int age;

    public Person (String name, int age){ //método constructor que devuelve dos parámetros
        this.name=name;
        this.age=age;
    }
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
    public abstract String description();

}
