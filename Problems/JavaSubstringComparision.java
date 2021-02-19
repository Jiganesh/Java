// Problem from HackerRank

import java.util.Scanner;
public class JavaSubstringComparision {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int k = scanner.nextInt();

        String current = s.substring(0,k);
        String largest = current;
        String smallest = current;

        for (int i = 1 ; i<= s.length()-k; i++){
            current = s.substring(i,i+k);
            if (current.compareTo(largest)>0){
                largest = current;
            }   
            if (current.compareTo(smallest)<0){
                smallest= current ;
            }     
        }System.out.println(smallest+"\n"+largest);

        scanner.close();
    }
}
