import java.util.stream.IntStream;

public class Map {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 3 };
        int[] array = IntStream.of(arr).map(i -> i * 2).toArray();
        for (int item : array) {
            System.out.println(item);
        }
        System.out.println();
        // Important
        IntStream.of(array).map(i -> i / 2).forEach(System.out::print);
        System.out.println("\n");

        IntStream.of(arr).forEach(System.out::print);

    }
}
