import java.util.stream.IntStream;

public class Y_BarChart {
    public static void main(String[] args) {

        int[] array = { 4, 3, 2, 7, 5 };

        int maxInArray = IntStream.of(array).max().getAsInt();

        for (int i = maxInArray; i >= 0; i--) {

            for (int j = 0; j < array.length; j++) {

                if (array[j] <= i) {
                    System.out.print(" \t");
                } else {
                    System.out.print("*\t");
                }
            }
            System.out.println();
        }
    }
}
