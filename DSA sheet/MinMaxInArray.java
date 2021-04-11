// Find Min and Max in Array in Minimum Comparisons

public class MinMaxInArray {
    public static void main(String[] args) {

        int[] array = { 5, 3, 1, 2, 4, 6, 7 };

        int i = 0;
        int max = array[0];
        int min = array[0];

        if (array.length % 2 != 0) {
            max = array[0];
            min = array[1];
            i = 1;
        }

        while (i < array.length) {
            if (array[i] > array[i + 1]) {
                if (array[i] > max) {
                    max = array[i];
                }
                if (array[i + 1] < min) {
                    min = array[i + 1];
                }
            } else {
                if (array[i + 1] > max) {
                    max = array[i + 1];
                }
                if (array[i] < min) {
                    min = array[i];
                }
            }
            i = i + 2;
        }

        System.out.printf("%d is the maximum element in array\n%d is the minimum element in array", max, min);
    }
}

// Time Complexity : 3*(n-1)/2
