package AddeerSubtracter;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Value v = new Value();
        Adder a = new Adder(v);
        Subtracter s = new Subtracter(v);

        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<Void> futureAdder = es.submit(a);
        Future<Void> futureSub = es.submit(s);
        futureAdder.get();
//        futureSub.get();
//        System.out.println("Hello World");
        System.out.println(v.value);
    }
}
