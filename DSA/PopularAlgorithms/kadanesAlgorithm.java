package PopularAlgorithms;

public class kadanesAlgorithm {
    public static void main(String... args){

        int[] array =  {3,5,-9,1,3,-2,3,4,7,2,-9,6,3,1,-5,4};
        System.out.println(maxSubarraySum(array));

    }

    public static int maxSubarraySum(int [] array){

        int maxEndingHere= array[0];
        int current = array[0];


        for (int i=1 ; i<array.length; i++){
            maxEndingHere = Math.max(array[i], maxEndingHere+array[i]);
            current = Math.max(current, maxEndingHere);
            System.out.println(maxEndingHere+" "+current);
        }

        return current;
    }
}
