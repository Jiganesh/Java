import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number that needs to be reversed.");
        int number = scan.nextInt();
        int check = number;
        int result = 0;
        while (number > 0) {
            int last = number % 10;
            result = result * 10 + last;
            number = number / 10;
        }
        if (result == check){
            System.out.println("The number is palindrome");
        }else{
            System.out.println("The number is not palindrome");
        }
        scan.close();
    }
}