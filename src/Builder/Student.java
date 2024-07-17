package Builder;

public class Student {
    int age;
    String name;
    String batch;
    int gradYear;
    String course;

    Student(StudentBuilder builder){
//        if(builder.age<10){
//            throw new IllegalArgumentException("Age must be at least 10");
//        }
//
//        if(builder.gradYear > 2024){
//            throw new IllegalArgumentException("GradYear must be smaller than 2024");
//        }

        if(builder.course!=null){
            this.course = builder.course;
        }else{
            this.course = "Academy";
        }

        this.age = builder.age;
        this.name = builder.name;
        this.batch = builder.batch;
        this.gradYear = builder.gradYear;
    }

    static StudentBuilder getBuilder(){
        return new StudentBuilder();
    }

}
