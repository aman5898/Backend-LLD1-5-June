package IterableAndIterator;

import java.util.Iterator;
import java.util.List;

public class Numbers implements Iterable<Integer> {
    List<Integer> list;

    public Numbers(List<Integer> list) {
        this.list = list;
    }

    @Override
    public Iterator<Integer> iterator() {
//        first Way
//        Iterator<Integer> rr = new RandomIterator(cnstructorData);
//        return rr;

        // Second Way
        Iterator<Integer> rr = new Iterator<Integer>() {

            int index = 0;

            @Override
            public boolean hasNext() {
//                return index < list.size();
                while(index<list.size()){
                    if(list.get(index)%5==0){
                        return true;
                    }
                    index++;
                }
                return index!=list.size();
            }

            @Override
            public Integer next() {
                return list.get(index++);
            }
        };
        return rr;
    }
}
