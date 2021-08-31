package Algorithms.SortingAlgorithms;

public class MergeSort {
    public static void main(String[] args) {

        int[] array = { 3, 4, 8, 1, 2, -4, -6, -1, 10, 20, 5, 13 };
        int[] result = mergeSort(array);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + " ");
        }
    }

    public static int[] mergeSort(int[] array) {

        if (array.length > 1) {

            int mid = array.length / 2;
            int[] L = new int[mid];
            int[] R = new int[array.length - mid];
            for (int i = 0; i < mid; i++) {
                L[i] = array[i];
            }

            for (int i = 0; i < array.length - mid; i++) {
                R[i] = array[mid + i];
            }

            mergeSort(L);
            mergeSort(R);

            int i, j, k;
            i = j = k = 0;

            while (i < L.length && j < R.length) {
                if (L[i] < R[j]) {
                    array[k] = L[i];
                    i++;
                } else {
                    array[k] = R[j];
                    j++;
                }
                k++;
            }

            while (i < L.length) {
                array[k] = L[i];
                i++;
                k++;
            }

            while (j < R.length) {
                array[k] = R[j];
                j++;
                k++;
            }
        }
        return array;
    }
}