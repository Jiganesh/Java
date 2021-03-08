public class T_Pattern6 {
    public static void main(String[] args) {
        
        int n = 5; // Input will be always odd

        int stars = 3; // As stars go from 3 2 1 2 3 for each line on each side
        int space = 1; // As space go from 1 3 5 3 1 for each line

        for (int i = 1 ; i <=n; i++){

            for (int j = stars ; j>=1 ; j--){
                System.out.print(" * ");
            }

            for (int k = space; k>= 1; k--) {
                System.out.print("   ");
            }

            for (int j = stars; j >= 1 ; j--){
                System.out.print(" * ");
            }


            if ( i <= n/2){
                space+=2;
                stars--;
            }else{
                space-=2;
                stars++;
            }

            System.out.println();
        }
            
    }
}



/*

 Pattern 6

 *  *  *     *  *  * 
 *  *           *  *
 *                 *
 *  *           *  *
 *  *  *     *  *  *

*/