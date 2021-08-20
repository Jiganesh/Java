package Algorithms.SortingAlgorithms;

public class InsertionSort {
   public static void main(String[] args) {
       int [] sortedlist = insertionSort(new int []{1,2,97,6,54,3,45,3,64,43,75});
       for (int i : sortedlist){
        System.out.print(i+" ");

       }
    } 

    public static int[] insertionSort(int[] array){
        for (int i=0 ; i< array.length; i++){

            int key = array[i];
            int j = i-1;
            while (j>=0 && key<array[j]){
                array[j+1]=array[j];
                j-=1;
            }
            array[j+1]=key;
        }
        return array;
    }

}
