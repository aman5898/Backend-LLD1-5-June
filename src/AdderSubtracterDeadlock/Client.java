package AdderSubtracterDeadlock;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Lock lock = new ReentrantLock();
        Lock lock2 = new ReentrantLock();

        Value v = new Value();
        Adder a = new Adder(v,lock,lock2);
        Subtracter s = new Subtracter(v,lock,lock2);

        ExecutorService es = Executors.newFixedThreadPool(2);

        Future<Void> futureAdder = es.submit(a);
        Future<Void> futureSub = es.submit(s);
        futureAdder.get();
        futureSub.get();
//        System.out.println("Hello World");
        System.out.println(v.value);
    }
}
