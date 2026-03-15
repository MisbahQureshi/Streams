import java.util.*;
import java.util.stream.*;

//How do you generate an infinite stream of random numbers? remove limit its infinite

class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Stream.generate(() -> random.nextInt())
              .limit(10)
              .forEach(num -> System.out.println(num));
    }
}
