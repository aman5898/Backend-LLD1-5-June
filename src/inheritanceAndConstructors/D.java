package inheritanceAndConstructors;

public class D extends C{
    D(){
        // this has to be your first line;
//        super(5);
        super();
        System.out.println("D constructor is Executed");

    }
}
