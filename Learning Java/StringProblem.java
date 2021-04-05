import java.util.ArrayList;
import java.util.Scanner;

public class StringProblem {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        
        ArrayList<String> alist = new ArrayList<String>();

        while (n>0){
            alist.add(scan.next());
            n-=1;
        }

        String answer = String.join(" ",removezodd(alist));
        System.out.println(answer);
        scan.close(); 
        
    }

    public static ArrayList<String> removezodd (ArrayList<String> block ){

        ArrayList<String> result = new ArrayList<String>();
        for (String string : block) {
            if (string.chars().count()%2==0){
                result.add(string);
            }
        }

        return result;
    }
}
