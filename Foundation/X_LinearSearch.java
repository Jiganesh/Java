public class X_LinearSearch {
    public static void main(String[] args) {

        int[] array = { 34, 45, 64, 23, 76, 23, 87, 65 };
        int toFind = 87 ;

        // Index of first occurence of target will be returned
        
        System.out.println(LinearSearch(array, toFind));
    }

    public static int LinearSearch(int[] array, int toFind) {

        for (int i = 0; i < array.length; i++) {

            if (array[i] == toFind) {

                return i;
            }
        }
        return -1;
    }
}
