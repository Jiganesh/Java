import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find out its factorial");
        int number = scan.nextInt();
        int result = 1;

        for (int i = number; i > 1; i--) {
            result *= i;
        }
        System.out.println("The factorial of number " + number + " is  : " + result);
        scan.close();
    }
}