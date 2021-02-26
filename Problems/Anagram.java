import java.util.Scanner;
import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String b = scanner.nextLine();
        System.out.println(checkAnagram(a, b));
        scanner.close();
    }

    public static boolean checkAnagram(String a, String b) {

        char[] ac = a.toLowerCase().toCharArray();
        char[] bc = b.toLowerCase().toCharArray();
        Arrays.sort(ac);
        Arrays.sort(bc);

        String sa = new String(ac);
        String sb = new String(bc);

        System.out.println(ac);
        System.out.println(bc);

        // One way to do it using the Arrays Package is this !
        //System.out.println(Arrays.equals(ac, bc));

        return (sa.equalsIgnoreCase(sb)) ? true : false;
    }
}      
