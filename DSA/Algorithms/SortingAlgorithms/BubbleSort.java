package Algorithms.SortingAlgorithms;

public class BubbleSort {
    public static void main(String[] args) {
        
        int [] sortedlist = bubbleSort(new int[]{5,3,4,6,-2,8,9,10,-1,1,9,20,0,1,2});
        
        for (int i: sortedlist){
            System.out.print(i+" ");
        }

    }

    public static int[] bubbleSort(int [] array){

        for (int i =0; i< array.length ; i++){
            for (int j =0 ; j< array.length-1;j++){
                if (array[j]>=array[j+1]){
                    swap(array, j , j+1);
                }
            }
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
