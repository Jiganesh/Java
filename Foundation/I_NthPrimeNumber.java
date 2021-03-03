import java.util.Scanner;

public class I_NthPrimeNumber {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int low = scan.nextInt();
        int high = scan.nextInt();

        for (int i = low; i <= high; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }

        scan.close();

    }

    public static boolean checkPrime(int numToCheck) {

        int flag = 0;

        for (int i = 2; (i * i) - 1 < numToCheck; i++) {
            if (numToCheck % i == 0) {
                flag = 1;
                break;
            }
        }

        return (flag == 0) ? true : false;
    }
}
