package AdderSubtracterDeadlock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtracter implements Callable<Void> {
    private Value v;
    private Lock lock;
    private Lock lock2;

    Subtracter(Value v, Lock lock,Lock lock2){
        this.v = v;
        this.lock = lock;
        this.lock2 = lock2;
    }


    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++){
            lock.lock();
            lock2.lock();
            System.out.println("Subtracter" + i);
            this.v.value-=i;
            lock2.unlock();
            lock.unlock();

        }
        return null;
    }
}
