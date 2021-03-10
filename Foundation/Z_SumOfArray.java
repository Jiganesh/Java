public class Z_SumOfArray {
    public static void main(String[] args) {

        int[] arr1 = { 4, 5, 2, 6, 7 };
        int[] arr2 = { 5, 8, 1, 3, 9, 5 };

        System.out.println(45267 + 581395);

        int maxlen = (arr1.length > arr2.length) ? arr1.length : arr2.length;

        int[] sum = new int[maxlen];

        int i = arr1.length - 1;
        int j = arr2.length - 1;
        int k = maxlen - 1;

        int carry = 0;
        int d;

        while (k >= 0) {
            d = carry;
            if (i >= 0) {
                d += arr1[i];
            }

            if (j >= 0) {
                d += arr2[j];
            }

            carry = d / 10;
            d = d % 10;
            sum[k] = d;

            i--;
            j--;
            k--;

        }

        if (i > 0) {
            System.out.print(carry);
        }

        for (int l : sum) {
            System.out.print(l);
        }

        System.out.println(45267 + 581395);
        // To check answer

    }
}
