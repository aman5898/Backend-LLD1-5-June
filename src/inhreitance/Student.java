package inhreitance;

public class Student extends User{
    private String batch;
    double psp;
    int age;


    // Telescoping of Constructors
    Student(){
        this.batch = "Free Batch";
        this.psp = 1;
    }

    Student(String batch){
//        this.batch = batch;
        this();
        this.psp = 1;
    }


    Student(String batch, double psp){
        this(batch);
        this.psp = psp;
    }

    Student(String batch, double psp,int age){
        this(batch,psp);
        this.age = age;
    }

    void attendClass(){
        this.name = "Preetam";
        System.out.println("Attending Class");
    }
}
