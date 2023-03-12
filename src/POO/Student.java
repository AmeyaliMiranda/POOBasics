package POO;

import javax.swing.*;
class Student extends Person{

    Student(String name, int age, String customdescription){

        super(name, age);
        this.description=customdescription;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }

}
