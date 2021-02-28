public class CharArrayToString {
    public static void main(String[] args) {
        
        char[] chararray = {'p','y','y','H','a','c','k','e','r'};

        String method1 =  new String(chararray);
        String method2 = String.valueOf(chararray);

        System.out.printf("%s %s",method1,method2);
         
        // pyyHacker pyyHacker
    }
}
