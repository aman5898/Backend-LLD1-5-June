package Builder;

public class Student {
    final int age;
    final String name;
    final String batch;
    final int gradYear;
    String course;
    int psp;


    private Student(StudentBuilder builder){
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

    static public class StudentBuilder {
        int age;
        String name;
        String batch;
        int gradYear;
        String course;

        public StudentBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public StudentBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public StudentBuilder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public StudentBuilder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public StudentBuilder setCourse(String course) {
            this.course = course;
            return this;
        }

        public Student build() {
            if(this.age<10){
                throw new IllegalArgumentException("Age must be at least 10");
            }

            if(this.gradYear > 2024){
                throw new IllegalArgumentException("GradYear must be smaller than 2024");
            }
            return new Student(this);
        }
    }

}
