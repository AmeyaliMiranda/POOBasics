package POO;

public class UsePerson {
    public static void main(String[] args){

        Person[] people=new Person[2];

        people[0]=new Student("ANA",24,"Hey taka taka");
        people[1]=new Employee("FER",35, "Hey ya me canse");

        for (Person p:people) {
            System.out.println(p.getName() + " , " + p.getAge() + " , " + p.getDescription());

        }
    }
}
