// project Calculator

import java.util.Scanner;

public class SwitchConditionProject {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your first number");
        int a = scan.nextInt();
        System.out.println("Enter your second number");
        int b = scan.nextInt();

        System.out.println("Enter the Operation");
        scan.nextLine();
        char operation = scan.nextLine().charAt(0);

        int result = 0;

        switch (operation) {
            case '+':
                result = a + b;
                break;
            case '-':
                result = a - b;
                break;
            case '*':
                result = a * b;
                break;
            case '/':
                result = a / b;
                break;
            default:
                System.out.println("Not a valid operation");
        }
        System.out.println("The result of the given operation is : " + result);
        scan.close();
    }
}

/*
 * You can also do like this if two cases are giving same
 * 
 * case 1: case 2: statements; break;
 */