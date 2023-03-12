package POO;

import javax.swing.*;

class Student extends Person{
    private String des;

    public Student(String name, int age){
        super(name, age);
    }
    public void setDescription(){
        String des = JOptionPane.showInputDialog("Type description");
    }
    public String absDescription(){
        return des;
    }
}
