public class T_Pattern8 {
    public static void main(String[] args) {

        int n = 5;
        for (int i = n; i >= 1; i--) {

            for (int j = i - 1; j >= 0; j--) {
                System.out.print("  ");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}


/*

Pattern 8

          *
        *
      *
    *
  *
*


*/