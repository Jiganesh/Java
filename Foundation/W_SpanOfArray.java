import java.util.stream.IntStream;

public class W_SpanOfArray {
    public static void main(String[] args) {
        
        // Difference between the Maximum and the Minimum of array is called Span of Array.

        int [] array = {45,63,87,39,34,56};

        int maxInArray = IntStream.of(array).max().getAsInt(); // 87
        int minInArray = IntStream.of(array).min().getAsInt(); // 34

        int SpanOfArray = maxInArray-minInArray;

        System.out.println(SpanOfArray); //53
    
    }
}
