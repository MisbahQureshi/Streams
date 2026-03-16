import java.util.*;
import java.util.stream.*;

//remove duplicates

class Main {
    public static void main(String[] args) {
       
        List<Integer> nums = Arrays.asList(9,1,4,5,6,5,7,2,3,4,5,9,7,3);
        
        System.out.println(nums.stream().collect(Collectors.toCollection(() -> new LinkedHashSet<Integer>())));
        
        System.out.println(nums.stream().collect(Collectors.toSet()));
        
        System.out.println(nums.stream().collect(Collectors.toCollection(() -> new TreeSet<Integer>())));
    }
}
