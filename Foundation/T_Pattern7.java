public class T_Pattern7 {
    public static void main(String[] args) {
        
        int n = 5;

        for (int i =0 ; i <= n ; i++){

            for (int j = i ; j >=0; j--){
                System.out.print("_");
            }
            System.out.print("*");
            System.out.println();
        }
    }
}

/*

Pattern 7
   
    *
       *
          *
             *
                *
                   *

*/