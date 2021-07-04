import java.util.Scanner;

public class StringAssignment1 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        //String input = scan.nextLine();
        //System.out.println(moveSpecialCharacters(input));

        // Some TestCases
        System.out.println(moveSpecialCharacters("%$Wel*&come!"));
        System.out.println(moveSpecialCharacters("He@#$llo!*&"));
        System.out.println(moveSpecialCharacters("Z%*^zA*@a"));
        System.out.println(moveSpecialCharacters("0@$^23!0*9"));
        System.out.println(moveSpecialCharacters("GSDFHJKG"));
        System.out.println(moveSpecialCharacters("@#$%^&*&%$%"));
        System.out.println(moveSpecialCharacters(""));
        scan.close();
    }

    public static String moveSpecialCharacters(String str){
		char[] strarray = str.toCharArray();
        String onlyalphabets ="", onlysymbols="";

        for (char c : strarray) {
            // You can also use Character.isLetterOrDigit(c) it will return boolean value
            if ((c>=65 && c<=90 )||(c>=97 && c<=122)||(c>='0'&&c<='9')){
                onlyalphabets+=c;
            }else{
                onlysymbols+=c;
            }
        }
        
        return onlyalphabets.concat(onlysymbols);
	}
}
