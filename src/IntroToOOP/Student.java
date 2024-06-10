package IntroToOOP;

import java.util.ArrayList;

public class Student {
    public String name;
    int age;
    protected double psp;
    public String batch;
    Exam exam;

    static int noOfStudents;

    // static block
    static {
        // static block will run time when the class loads
        // You can write as many static blocks as you want
        // It will be executed one after another
        // write the logic
        System.out.println("First Printing");
        noOfStudents = 100;
    }


    public Student() {
        name = "Venkat";
        age = 18;
        noOfStudents++;
    }

    public Student(String name,int age) {
        this.name = name;
        this.exam = new Exam(1,90);
        noOfStudents++;
    }

    public Student(Student other){
        this.name = other.name;
        this.age = other.age;
        this.psp = other.psp;
        this.batch = other.batch;
        this.exam = new Exam(other.exam);
//        below will create only a shallow copy of exam
//        this.exam = other.exam;
        this.noOfStudents++;
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

    static int getNoOfStudents(){
//        System.out.println(name);
        return Student.noOfStudents;
    }
}

// private : only same class
// default : same class + package : Package level protected
// protected : same class + package + child_class_outside_package
// public : anywhere
