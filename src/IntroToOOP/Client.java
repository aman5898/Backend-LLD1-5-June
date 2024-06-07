package IntroToOOP;

public class Client {
    public static void main(String[] args) {
        Student x = new Student();
        x.age = 35;

        Student y = new Student("Abhishek");
        y.age = 35;
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
        x.setName("SRK");
        System.out.println(x.getName());
    }
}
