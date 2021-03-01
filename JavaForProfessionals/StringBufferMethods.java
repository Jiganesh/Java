import java.lang.StringBuffer;

public class StringBufferMethods {
    public static void main(String[] args) {
        StringBuffer string = new StringBuffer("Learn ");

        string.append("Java");   //Learn Java

        string.insert(6, "core ");  //Learn core Java

        string.replace(0,5,"Study");    //Study core Java

        string.delete(6, 11);  //Study Java

        string.reverse(); // avaJ ydutS
        string.reverse(); // Study Java

        char first = string.charAt(0); //first = S

        String substr = string.substring(0,5); //substr = Study

        System.out.println(first);
        System.out.println(substr);

    }
}
