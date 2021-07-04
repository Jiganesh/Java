public class StringAssignment3 {
    public static void main(String[] args) {
        
        String str = "all cows eat grass";
	    System.out.println(reverseEachWord(str));
    }

    public static String reverseEachWord(String str){
	    //Implement your code here and change the return value accordingly

        String[] words = str.split(" ");

        String[] result =new String[words.length];

        for (int i = 0; i < words.length; i++) {
            StringBuilder word = new StringBuilder(words[i]);
            result[i]=word.reverse().toString();
        }

        return String.join(" ", result);
	}
}
