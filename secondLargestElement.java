import java.util.*;
import java.util.stream.*;

//second largest element in the list

class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,20,30,40,50,34,54,22,55);
        System.out.println(nums.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst());
        
    }
}
