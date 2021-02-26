import java.util.Calendar;
import java.util.Date;

public class InstanceOf {
    public static void main(String[] args) {
        /*
         * Java provides the instanceof operator to test if an object is of a certain
         * type, or a subclass of that type. The program can then choose to cast or not
         * cast that object accordingly.
         */

        Object obj = Calendar.getInstance();
        
        String time = "";
        if (obj instanceof Calendar) {
            time = ((Calendar) obj).getTime().toString();
        }
        if (obj instanceof Date) {
            System.out.println(((Date) obj).getTime()); // This line will never be reached, obj is not a Date type.
        }

        System.out.printf("%s",time);
    }
}
