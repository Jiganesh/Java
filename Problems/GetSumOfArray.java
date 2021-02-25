public class GetSumOfArray {
    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8,9};
        int sum = java.util.stream.IntStream.of(array).reduce(0,(a,b)->a+b);
        System.out.println(sum);
    }
}
