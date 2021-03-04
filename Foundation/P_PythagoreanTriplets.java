import java.util.stream.IntStream;

public class P_PythagoreanTriplets {
    public static void main(String[] args) {
        
        int [] array = {5, 3, 4};
        
        int [] sortedarray = IntStream.of(array).sorted().toArray();

        int side1 = sortedarray[0];
        int side2 = sortedarray[1];
        int largeside = sortedarray[2];

        String result = ( largeside * largeside == side1*side1 + side2*side2) ? "Triplet":"Not Triplet";
        System.out.println(result);

    }
}
