// https://www.hackerrank.com/challenges/java-end-of-file/problem

import java.util.Scanner;

public class EndOfFile {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int i =1;
        while (scan.hasNext()){
            System.out.println(i+" "+scan.nextLine());
            i++;
        scan.close();
        }
    } 
}
