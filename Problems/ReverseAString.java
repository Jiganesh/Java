public class ReverseAString {
    public static void main(String[] args) {
        
        String code = "pyyHacker";
        StringBuilder resultstring = new StringBuilder(code);
        String result = resultstring.reverse().toString();
        
        System.out.println(result);  // rekcaHyyp
    }
}
