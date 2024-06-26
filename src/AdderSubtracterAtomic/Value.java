package AdderSubtracterAtomic;

import java.util.concurrent.atomic.AtomicInteger;

public class Value {
    public AtomicInteger value = new AtomicInteger(0);

}

//this.v.value+=i;
//val+=i;

//Compare and Swap
//t <- value 0              t <- value 0 -> x
//t = t+i                   t = t-i
//t -> value                t -> value
//                            if(value == x){
//                                t-> val
//                            else re-read the initial Value