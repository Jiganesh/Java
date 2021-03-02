import java.util.Scanner;

// https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/print-value-of-rsb-mask-official/ojquestion

public class Problem2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);

        int n = scan.nextInt();
        
        int rsb = n & -n;
        System.out.println(Integer.toBinaryString(rsb));
        
        scan.close();
    }
}

// Input  58
// Output 10