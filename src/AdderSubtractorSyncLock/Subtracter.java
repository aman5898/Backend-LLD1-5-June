package AdderSubtractorSyncLock;

import java.util.concurrent.Callable;
import java.util.concurrent.locks.Lock;

public class Subtracter implements Callable<Void> {
    private Value v;

    Subtracter(Value v){
        this.v = v;
    }


    @Override
    public Void call() throws Exception {
        for(int i=1;i<=10000;i++){
            synchronized (v) {
                System.out.println("Subtracter" + i);
                this.v.value -= i;
            }
        }
        return null;
    }
}
