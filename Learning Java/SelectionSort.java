public class SelectionSort {
    public static void main(String[] args) {
        int[] array={6,3,4,6,1,5,6,3,9,10};
        int n = array.length;

        for (int i = 0; i< n; i++){
            int mini = i;
            for (int j = i; j<n; j++){
                if (array[mini] >= array[j]){
                    mini=j;
                }
            }
            int temp = array[i];
            array[i]=array[mini];
            array[mini]=temp;
        }

        for (int item: array){
            System.out.print(item +" ");
        }
    }
}
