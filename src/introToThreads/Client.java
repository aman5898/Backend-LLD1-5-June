package introToThreads;

public class Client {
    public static void main(String[] args) {
//        Runnable h = new HelloWorldPrinter();
//        for(int i=0;i<100;i++){
//            Thread t = new Thread(h);
////            t.run();
//            t.start();
//        }

        for(int i=1;i<=1000;i++){
            NumberPrinter numberPrinter = new NumberPrinter(i);
            Thread thread = new Thread(numberPrinter);
            thread.start();
        }

//        Thread t = new HelloWorldPrinter2();
//        t.start();

    }
}

// Implementing Runnable vs Extending Thread Class
// Since you can inherit only 1 class, scope of extension is not there in 2nd Case
// Thread is also using runnable.
//Composition vs Inheritance

//run(); Can you return anything? NO: Callable
//ThreadPool : ExecutorService
// Multithreaded mergeSort
