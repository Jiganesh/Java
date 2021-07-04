
public class StringAssignment4 {

    public static int findHighestOccurrence(String str){
        int max =-1;
        int frequency=-1;
		for (int i = 0; i < str.length(); i++) {
            frequency =count(str.charAt(i),str);
            if (max<=frequency ){
                max = frequency;
            }
        }
        return max;
        
	}
    public static int count(char c, String str){
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (c == str.charAt(i)){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str = "AabbbccDDEEee";
	    System.out.println(findHighestOccurrence(str));
    }
}
