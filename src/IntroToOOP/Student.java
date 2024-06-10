package IntroToOOP;

import java.util.ArrayList;

public class Student {
    public String name;
    int age;
    protected double psp;
    public String batch;
    Exam exam;

    public Student() {
        name = "Venkat";
        age = 18;
    }

    public Student(String name,int age) {
        this.name = name;
        this.exam = new Exam(1,90);
    }

    public Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.psp = other.psp;
        this.batch = other.batch;
        this.exam = other.exam;
    }


    void print(){
        System.out.println("Name: " + name);
    }

    void setName(String name){
        name = name;
    }

    void Test(){
        System.out.println(this);
    }

    String getName(){
        return this.name;
    }
}

// private : only same class
// default : same class + package : Package level protected
// protected : same class + package + child_class_outside_package
// public : anywhere
