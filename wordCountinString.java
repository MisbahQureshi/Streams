import java.util.*;
import java.util.stream.*;
//word occurances count groups
class Main {
    public static void main(String[] args) {
        String str = "java spring java docker spring java";
        System.out.println(
        Arrays.stream(str.split(" ")).collect(Collectors.groupingBy(x->x, Collectors.counting()))    
        );
    }
}
