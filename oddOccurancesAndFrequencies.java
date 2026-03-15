import java.util.*;
import java.util.stream.Collectors;

//get the odd occurances and its frequency

class Main {
    public static void main(String[] args) {
        List<Integer> num = Arrays.asList(1,4,5,6,5,7,2,3,4,5,9,7,3);
        System.out.println(num.stream().filter(x->x%2!=0).collect(Collectors.toMap(k->k,v->1,(a,b)-> a+b)));
    }
}
