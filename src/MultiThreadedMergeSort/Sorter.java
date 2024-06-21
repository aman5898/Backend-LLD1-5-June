package MultiThreadedMergeSort;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Sorter implements Callable<List<Integer>> {
    List<Integer> arrayToSort;
    ExecutorService executor;

    Sorter(List<Integer> arrayToSort,ExecutorService executor){
        this.arrayToSort = arrayToSort;
        this.executor = executor;
    }


    @Override
    public List<Integer> call() throws Exception {
        if(arrayToSort.size()==1){
            return arrayToSort;
        }

        int mid = arrayToSort.size()/2;

        List<Integer> leftArray = new ArrayList<>();
        List<Integer> rightArray = new ArrayList<>();

        for(int i=0;i<mid;i++){
            leftArray.add(arrayToSort.get(i));
        }

        for(int i=mid;i<arrayToSort.size();i++){
            rightArray.add(arrayToSort.get(i));
        }

        Sorter leftArraySorter = new Sorter(leftArray,executor);
        Sorter rightArraySorter = new Sorter(rightArray,executor);

        // Runnable -> es.execute
        // Callable -> es.submit

//      ExecutorService es = Executors.newFixedThreadPool(2);
        Future<List<Integer>> leftFuture = executor.submit(leftArraySorter);
        Future<List<Integer>> rightFuture = executor.submit(rightArraySorter);

        List<Integer> sortedLeftArray = leftFuture.get();
        List<Integer> sortedRightArray = rightFuture.get();

        // merge : wait for the sorted arrays

        int i= 0;
        int j = 0;

        List<Integer> sortedArray = new ArrayList<>();

        while (i < sortedLeftArray.size() && j < sortedRightArray.size()) {
            if (sortedLeftArray.get(i) <= sortedRightArray.get(j)) {
                sortedArray.add(sortedLeftArray.get(i));
                i += 1;
            } else {
                sortedArray.add(sortedRightArray.get(j));
                j += 1;
            }
        }

        while (i < sortedLeftArray.size()) {
            sortedArray.add(sortedLeftArray.get(i));
            i += 1;
        }

        while (j < sortedRightArray.size()) {
            sortedArray.add(sortedRightArray.get(j));
            j += 1;
        }

        return sortedArray;
    }
}
