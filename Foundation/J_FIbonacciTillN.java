import java.util.Scanner;

public class J_FIbonacciTillN {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int n = scan. nextInt();

        int firstnumber = 0;
        int secondnumber = 1;

        for (int i =0 ; i < n; i++){
            System.out.println(firstnumber);
            int temp = firstnumber + secondnumber;

            firstnumber = secondnumber;
            secondnumber = temp;
        }
        scan.close();
        
    }
}
