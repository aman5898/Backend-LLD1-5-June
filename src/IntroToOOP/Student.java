package IntroToOOP;

public class Student {
    private String name;
    int age;
    protected double psp;
    public String batch;

    public Student() {
        name = "Venkat";
        age = 18;
        batch = "xyz";
    }

    public Student(String name) {
        this.name = name;
    }


    void print(){
        System.out.println("Name: " + name);
    }

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

// private : only same class
// default : same class + package : Package level protected
// protected : same class + package + child_class_outside_package
// public : anywhere
