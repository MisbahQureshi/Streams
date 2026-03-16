import java.util.*;
import java.util.stream.*;

//// Top 3 highest numbers

class Main {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,20,30,40,50,34,54,22,55);
        nums.stream().sorted(Comparator.reverseOrder()).limit(3).forEach(System.out::println);
        
    }
}
