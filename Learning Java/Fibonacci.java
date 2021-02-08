import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = scan.nextInt();

        int a = 0;
        int b = 1;
        System.out.print("The fibonacci sequence till nth number is :");
        System.out.print(a+" ");
        for (int i=1 ; i < number ; i++){
            System.out.print( b +" ");
            int c = a+b;
            a=b;
            b=c;
        }
        scan.close();
    }
    
}
