public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {5,6,2,5,7,9,1};
        int n = array.length;

        for (int i = 0; i<n; i++){
            for(int j =0; j <(n-i-1); j++){
                if (array[j] >= array[j+1]){
                    int temp = array[j];
                    array[j]= array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        
        for (int element : array){
            System.out.printf(element +" ");
        }
    }
}
