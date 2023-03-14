package POO;

import javax.swing.*;

class Employee extends Person {
    public Employee(String name, int age, String custoDescription){
        super(name, age);
        this.description=custoDescription;
    }
    public String getDescription(){
        return description;
    }
    public void setDescription(String description){
        this.description=description;
    }

}

