package Algorithms.SortingAlgorithms;

public class QuickSort {
    public static void main(String[] args) {    
        int [] array = {3,4,8,1,2,-4,-6,-1,10,20,5,2,13};
        int [] result = quicksort(array, 0, array.length-1);
        for (int i =0 ; i<result.length; i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int partition(int[] array , int low, int high){
        int i =low-1;
        int pivot = array[high];

        for(int j =low; j< high; j++){
            if(array[j]< pivot){
                i++;
                swap(array,i,j);
            }
        }
        swap(array, i+1,high);
        return i+1;
    }

    public static int[] quicksort(int[] array , int low, int high){
        if (low< high){
            int pi = partition(array, low, high);
            quicksort(array, low, pi-1);
            quicksort(array, pi+1, high);
        }
        return array;
    }

    public static void swap(int [] array, int i, int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;      
    }
}
