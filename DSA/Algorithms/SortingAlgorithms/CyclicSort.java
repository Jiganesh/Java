package Algorithms.SortingAlgorithms;

import java.util.Arrays;

public class CyclicSort{
    public static void main(String[] args) {

        int[] array = {4,2,3,5,7,8,9,6,1};
        System.out.println(Arrays.toString(cyclicSort(array)));
    }

    public static int[] cyclicSort(int[] array){

        for(int i= 0 ; i< array.length; i++){
            while(array[i] != i+1){
                int value= array[i];
                int valueNewIndex = value- 1;
                swap(array, i, valueNewIndex);
            }
        }
        return array;
    }

    public static void swap(int []array , int i, int j){
        int temp = array[i];
        array[i]=array[j];
        array[j]=temp;
    }
}