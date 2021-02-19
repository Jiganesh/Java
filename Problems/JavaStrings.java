import java.util.Scanner;
public class JavaStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String A = scanner.nextLine();
        String B = scanner.nextLine();

        System.out.println();
        System.out.println("Sum of length of two strings : " +(A.length()+B.length()));
        System.out.println();
        System.out.println("Is String A greater than B lexicographically : " + (A.compareTo(B)>0 ? "Yes": "NO"));
        System.out.println();
        System.out.printf("Capitalizing both strings : %s  %s",capitalize(A),capitalize(B));


        scanner.close();
    }
    
    public static String capitalize(String str){
        if (str == null || str.isEmpty()){
            return str;
        }
        return str.substring(0,1).toUpperCase()+str.substring(1);
    }
}
