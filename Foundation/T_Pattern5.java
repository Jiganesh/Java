public class T_Pattern5 {
    public static void main(String[] args) {

        int n = 5;
        // As Input pattern 5 will always have odd number.

        int space = 2;
        int stars = 1;

        for (int i = 1; i <= n; i++) {

            for (int j = space; j >= 1; j--) {
                System.out.print(" * ");
            }

            for (int k = stars; k >= 1; k--) {
                System.out.print(" * ");
            }

            if (i > n / 2) {
                space++;
                stars -= 2;
            } else {
                space--;
                stars += 2;
            }
            System.out.println();

        }
    }
}

/* 

Pattern 5

       * 
    *  *  *
 *  *  *  *  *
    *  *  *
       *

*/