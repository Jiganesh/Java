// https://www.pepcoding.com/resources/data-structures-and-algorithms-in-java-levelup/bit-manipulation/basics-of-bit-official/ojquestion

import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i = scn.nextInt();
        int j = scn.nextInt();
        int k = scn.nextInt();
        int m = scn.nextInt();

        // write your code here

        int onmask = (1 << i);
        int offmask = ~(1 << j);
        int tmask = (1 << k);
        int cmask = (1 << m);

        System.out.println(n | onmask);
        System.out.println(n & offmask);
        System.out.println(n ^ tmask);
        System.out.println((n & cmask) == 0 ? "false" : "true");
        scn.close();
    }
}


/* 

Input 

57
3 
3 
3 
3

Output

57
49
49
true

*/

