public class StringAssignment2 {
    public static void main(String[] args) {
        String str = "radar";
		if(checkPalindrome(str))
			System.out.println("The string is a palindrome!");
		else
			System.out.println("The string is not a palindrome!");
    }

    public static boolean checkPalindrome(String str){
        int i = 0;
        int j = str.length()-1;
        while(i<=j){
            if(str.charAt(i)!=str.charAt(j)){        
                return false;
            }
            ++i;
            --j;
            
        }
        return true;
	}
}
