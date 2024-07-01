package Collections;

public class Student implements Comparable<Student>{
    int age;
    double psp;
    String name;
    double attendance;

    Student(int age, double psp, String name , double attendance) {
        this.age = age;
        this.psp = psp;
        this.name = name;
        this.attendance = attendance;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + this.age +
                ", psp=" + this.psp +
                ", name='" + this.name + '\'' +
                ", attendance=" + this.attendance +
                '}';
    }

    // desc order of age
//    @Override
//    public int compareTo(Student o) {
//// This Object to come first return -1
//        // Other Object to come first 1
////        else return 0
//        if(this.age>o.age){
//            return -1;
//        }else if (this.age<o.age){
//            return 1;
//        }else{
//            return 0;
//        }
//    }

//    @Override
//    public int compareTo(Student o) {
//        return o.age-this.age;
//    }

    public int compareTo(Student o) {
        return this.age-o.age;
    }
}
