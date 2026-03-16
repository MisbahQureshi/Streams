import java.util.*;
import java.util.stream.*;

//get duplicates

class Main {
    public static void main(String[] args) {
       
        List<Integer> nums = Arrays.asList(9,1,4,5,6,5,7,2,3,4,5,9,7,3);
        
        Set<Integer> seen = new HashSet<>();
        System.out.println(nums.stream()
            .filter(n -> !seen.add(n))
            .collect(Collectors.toSet())
        );
    }
}
