package Builder;

//public class StudentBuilder {
//    int age;
//    String name;
//    String batch;
//    int gradYear;
//    String course;
//
//    public StudentBuilder setAge(int age) {
//        this.age = age;
//        return this;
//    }
//
//    public StudentBuilder setName(String name) {
//        this.name = name;
//        return this;
//    }
//
//    public StudentBuilder setBatch(String batch) {
//        this.batch = batch;
//        return this;
//    }
//
//    public StudentBuilder setGradYear(int gradYear) {
//        this.gradYear = gradYear;
//        return this;
//    }
//
//    public StudentBuilder setCourse(String course) {
//        this.course = course;
//        return this;
//    }
//
//    public Student build() {
//        if(this.age<10){
//            throw new IllegalArgumentException("Age must be at least 10");
//        }
//
//        if(this.gradYear > 2024){
//            throw new IllegalArgumentException("GradYear must be smaller than 2024");
//        }
//        return new Student(this);
//    }
//}
