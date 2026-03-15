import java.util.*;
import java.util.stream.*;

//How do you find the first element of a stream

class Main {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(9,1,4,5,6,5,7,2,3,4,5,9,7,3);
        System.out.println(num.stream().findFirst().get());
    }
}
