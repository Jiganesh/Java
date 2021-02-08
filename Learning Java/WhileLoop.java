// Reverse the give number using while loop.

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number that needs to be reversed.");
        int number = scan.nextInt();
        int result = 0;
        while (number > 0) {
            int last = number % 10;
            result = result * 10 + last;
            number = number / 10;
        }
        System.out.println("The reversed Number is : " + result);
        scan.close();
    }

}
