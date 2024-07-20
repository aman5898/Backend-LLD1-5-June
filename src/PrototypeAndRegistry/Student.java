package PrototypeAndRegistry;

public class Student implements ProtoType<Student>{
    private int id;
    String name;
    String batch;

    Student(){

    }

    Student(Student st) {
        this.id = st.id;
        this.name = st.name;
        this.batch = st.batch;
    }

    @Override
    public Student Copy() {
        Student st = new Student(this);
        return st;
    }
}
