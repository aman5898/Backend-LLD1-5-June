package accessModifiers;

import IntroToOOP.Student;

public class Client2{
    public static void main(String[] args) {
        Student s = new Student();
        s.batch = "XYZ";
//        s.psp = 20;
        System.out.println(s.batch);
    }
}
