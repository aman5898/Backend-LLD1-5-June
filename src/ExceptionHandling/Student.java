package ExceptionHandling;

import java.sql.SQLException;

public class Student {
    static int doSomething(int x) throws Exception {
//        return 1/x;

//        if(x==0){
//            throw new ArithmeticException();
//        }else if(x==1){
//            throw new ClassNotFoundException();
//        }else if(x==2){
//            throw new SQLException();
//        }else if (x==3){
//            throw new NullPointerException();
//        }else if (x==4){
//            throw new RandomException();
//        }else if (x==5){
//            throw new IllegalAccessException();
//        }

        try{
//            throw new Exception();
//            return 1;
        }catch(Exception e){
            return 0;
        }finally {
            return 5;
        }

//        return 0;
    }
}
