import java.util.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.*;

// Find the sum of all integers in a list using streams.

class Main {
    public static void main(String[] args) {
       
        List<Integer> nums = Arrays.asList(9,1,4,5,6,5,7,2,3,4,5,9,7,3); 
        System.out.println(nums.stream().reduce((a,b)->a+b));
        
        //running sum
        AtomicInteger sum = new AtomicInteger(0);
        System.out.println(
            nums.stream().map(sum::addAndGet).toList()
        );
    }
}
