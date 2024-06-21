package ThreadPool;

public class NumberPrinter implements Runnable{

    int number;

    NumberPrinter(int num){
        this.number = num;
    }

    @Override
    public void run() {
//        try {
//            Thread.sleep(20000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(this.number+" "+Thread.currentThread().getName());
    }
}
