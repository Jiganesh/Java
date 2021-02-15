import java.util.Scanner;
public class IntToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number which you want to convert from Integer to String:  ");
        int Number = scanner.nextInt();

        String method1 = String.valueOf(Number);
        String method2 = Integer.toString(Number);
        String method3 = ""+Number;

        System.out.printf(" method 1: %s%n method 2: %s%n method 3: %s%n",method1,method2,method3);

        scanner.close();
    }
}
