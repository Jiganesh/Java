// Karnighan's Algorithm
// https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/kernighans-algo-official/ojquestion
// You have to count the number of set bits in the given number.

import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int counter = 0;

        while (n > 0) {
            int rsb = n & -n;
            n = n - rsb;
            counter++;
        }
        System.out.println(counter);

        scan.close();
    }
}

// Input 10
// Output 2