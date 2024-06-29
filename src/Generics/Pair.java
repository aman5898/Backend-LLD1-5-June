package Generics;

public class Pair <V,S>{
    V first;
    S second;

    Pair(){

    }

    Pair(V first, S second){
        this.first = first;
        this.second = second;
    }

    public void setFirst(V data){
        this.first = data;
    }

    public V getFirst(){
        return first;
    }


    public S getSecond(){
        return second;
    }

    public <Z,Y> Y doAgain( Z val2, Y val3, V val1, int val4){
        return val3;
    }

    // Generic Method
    public static <T> T doSomething(T val){
        System.out.println(val);
        return val;
    }

//    // V and S will not be available here
//    // Generic Method
//    public static void doSomething2(V val1, S val2){
//        System.out.println(val);
//        return val;
//    }
}
