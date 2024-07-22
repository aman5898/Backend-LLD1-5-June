package PrototypeAndRegistry;

import java.util.ArrayList;

public class Client {

    static void doSomething(Student s){
//        Student st2= s.Copy();
////        IntelligentStudent copy = new IntelligentStudent();
////        Student st2 = new Student(s);
    }

    public static void fillRegistery(StudentRegistry studentRegistry){
        Student st = new Student();
        st.batch = "Nov23 Advance";
//        ArrayList
        studentRegistry.register("Student", st);

        IntelligentStudent st2 = new IntelligentStudent();
        studentRegistry.register("IntelligentStudent", st2);
    }

    public static void main(String[] args) {
//        Student st = new Student();
//        st.batch = "Test";
//        st.name = "ScalerStudent";
//
////        Student st2 = st.Copy();
//        doSomething(st);
//
//        IntelligentStudent ist = new IntelligentStudent();
//        doSomething(ist);

        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistery(studentRegistry);

        IntelligentStudent st = (IntelligentStudent) studentRegistry.get("Student");
    }
}
