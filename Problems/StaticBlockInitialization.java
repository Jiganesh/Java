// https://www.hackerrank.com/challenges/java-static-initializer-block/problem
import java.util.Scanner;

public class StaticBlockInitialization {
    static int B;
    static int H;
    static boolean flag = true;

    static {
        Scanner scan = new Scanner(System.in);

        B = scan.nextInt();
        H = scan.nextInt();

        if (B <= 0 || H <= 0) {
            System.out.println("java.lang.Exception: Breadth and height must be positive");
            System.exit(0);
        scan.close();
        }
    }
    public static void main(String[] args) {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }
}
