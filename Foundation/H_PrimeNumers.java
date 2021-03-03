import java.util.Scanner;

public class H_PrimeNumers {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int numOfInputs = scan.nextInt();

        while (numOfInputs > 0) {
            int numToCheck = scan.nextInt();

            int flag = 0;

            for (int i = 2; i < Math.pow(numToCheck, (1 / 2) + 1); i++) {
                if (numToCheck % i == 0) {
                    flag = 1;
                    break;
                }
            }
            String result = (flag == 0) ? "Prime" : "Not Prime";
            System.out.println(result);
            numOfInputs--;
        }
        scan.close();
    }
}
