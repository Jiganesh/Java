import java.util.Scanner;

public class PrimeOrNot {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to find out it is prime or not");
        int number = scan.nextInt();
        int flag = 0;
        
        for (int i =2; i < number; i++){
            if (number%i == 0){
                flag=1;
            }
        }

        switch(flag){
            case 1: System.out.println("The number is not Prime"); break;
            case 0: System.out.println("The number is prime"); break;
        }
        scan.close();        
    }
}
