package inheritanceAndConstructors;

public class C extends B{
    C(){
        System.out.println("C constructor is Executed");
    }

    C(int x){
        System.out.println("C's Parametrised constructor is Executed");
    }
}
