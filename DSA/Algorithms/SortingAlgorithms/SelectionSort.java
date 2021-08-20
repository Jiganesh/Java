package Algorithms.SortingAlgorithms;

public class SelectionSort {
    public static void main(String[] args) {
        int [] sortedlist = selectionSort(new int []{9,3,2,3,7,8,10,1,2,7,19,10,15,20});
        for (int i : sortedlist){
            System.out.print(i+" ");
        }
    }
    public static int[] selectionSort(int [] array){
        for(int i =0 ; i<array.length;i++){
            int k = i;
            for (int j = i+1; j<array.length;j++){
                if(array[j]<=array[k]) k=j;
            }
            swap(array, k,  i);
        }
        return array;
    }
    public static int[] swap(int []array, int j, int i){
        int temp = array[i];
        array[i]= array[j];
        array[j]= temp;
        return array;
    }
    
}
