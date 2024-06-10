package IntroToOOP;

public class Client {

    public static void main(String[] args) {
//        Student x = new Student();
//        x.age = 35;
//
//        Student y = new Student("Abhishek");
//        y.age = 35;
//        Student y = x;
//        y.age+=10;
//        System.out.println(y.age);
//        System.out.println(x.age);
//
//        Student z = new Student();
//        z.age+=10;
//        System.out.println(z.age);
//        y = new Student();
//        System.out.println(y.age);

        // error bcoz name is private
//        x.name = "SRK";
//        x.setName("SRK");
//        System.out.println(x.getName());
//        Student x = new Student();
//        System.out.println(x.psp);
//        Student y = new Student("Temp");
//        System.out.println(y.psp);
//        System.out.println(y.name);

        // this keyword
//        Student x = new Student("Preetam");
//        System.out.println(x);
//        x.Test();
//
//        Student y = new Student();
//        System.out.println(y);
//        y.Test();

        // Copy Constructor
//        Student x = new Student();
//        Student y = x;
//        x.name = "Test";
//        System.out.println(y.name);
//
//        Student z = new Student(x);
//        x.name = "Changed Again";
//
//        System.out.println(x);
//        System.out.println(y);
//        System.out.println(z);
//        System.out.println(z.name);


//        Student xx = new Student();
//
//        Student zz = new Student();
//        zz.name = xx.name;
//
//
//        Student s1 = new Student();
//        Student s2 = new Student();
//        s1=s2;

//        Student s1 = new Student("Shubham",25);
//        Student copy1 = new Student(s1);

        // Static Variable

        System.out.println(Student.noOfStudents);
        System.out.println("Test");
        Student s1 = new Student();
        System.out.println(s1.noOfStudents);
        Student s2 = new Student("Shubham",25);
        System.out.println(s2.noOfStudents);
        Student s3 = new Student(s2);
        System.out.println(s3.noOfStudents);
        s3.print();
        System.out.println(Student.getNoOfStudents());
//        Student.print();

        int x = Math.abs(10);
    }
}
