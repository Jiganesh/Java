public class ReverseAStringUsingCharArray {
    public static void main(String[] args) {
        
        char [] code = "PyyHacker".toCharArray();

        for (int start = 0 , end = code.length-1 ; start < end; start++ , end--){
            char temp = code[start];
            code[start] = code[end];
            code[end]=temp;
        }
        String result = new String(code);
        System.out.println(result);
    }
}
