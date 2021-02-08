import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the Number you want to find power of :");
        int a = scan.nextInt();
        System.out.println("Enter the Power of the Number :");
        int b = scan.nextInt();

        int c=1;

        for (int i =0 ; i< b; i++){
            c*=a;
        }
        System.out.println("The result is : " + c);

        scan.close();
    }
}
