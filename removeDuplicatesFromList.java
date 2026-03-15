import java.util.*;
import java.util.stream.Collectors;

//remove duplicate elements from a list using streams

class Main {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,4,5,6,5,7,2,3,4,5,9,7,3);
        System.out.println(num.stream().collect(Collectors.toSet()));
    }
}
