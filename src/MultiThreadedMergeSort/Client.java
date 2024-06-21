package MultiThreadedMergeSort;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> list = List.of(8  , 1 ,2 , 9 , 6 , 3 , 7, 5);
        ExecutorService es= Executors.newCachedThreadPool();

        Sorter sorter = new Sorter(list,es);

        Future<List<Integer>> listFuture = es.submit(sorter);

        List<Integer> ans = listFuture.get();
        System.out.println(ans);


    }
}
