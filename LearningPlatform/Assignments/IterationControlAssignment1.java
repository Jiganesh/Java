

public class IterationControlAssignment1 {
    public static void main(String[] args) {
        int number = 34543;
        System.out.println(checkpalindrome(number));

    }

    public static String checkpalindrome(int number){
        String numberstr = String.valueOf(number);
    
        int start =0;
        int end =numberstr.length()-1 ;

    
        while (start < end ){
    
            String startchar =String.valueOf(numberstr.charAt(start));
            String  endchar =String.valueOf(numberstr.charAt(end));

            if (!(startchar.equals(endchar))){
                return numberstr +" is not palindrome";
                
            }
            start++;
            end--;
        }

        return numberstr + " is a palindrome";
    
    }

}
