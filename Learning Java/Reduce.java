import java.util.stream.IntStream;

public class Reduce{
    public static void main(String[] args) {
        int [] x = {1,2,3,4,5};
        System.out.println(IntStream.of(x).reduce(0,(a,b)-> a+b));
    }
}