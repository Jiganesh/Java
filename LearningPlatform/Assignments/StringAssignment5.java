public class StringAssignment5 {
    public static String removeDuplicatesandSpaces(String str){
        //Implement your code here and change the return value accordingly
        String result ="";
        for (int i = 0; i < str.length(); i++) {
            if(result.indexOf(str.charAt(i))>-1){
                continue;
            }else{
                result+=str.charAt(i);
            }
        }
        return result.replace(" ", "");
	}
	
	public static void main(String args[]){
	    String str = "object oriented programming";
	    System.out.println(removeDuplicatesandSpaces(str));
	} 
}
