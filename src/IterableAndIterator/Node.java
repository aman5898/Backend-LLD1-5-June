package IterableAndIterator;

import java.util.Iterator;

public class Node implements Iterable<Node> {
    private int data;
    private Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    @Override
    public Iterator<Node> iterator() {
        return new Iterator<Node>() {



            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Node next() {
                return null;
            }
        };
    }
}



