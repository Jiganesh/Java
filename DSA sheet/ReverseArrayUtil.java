import java.util.Arrays;
import java.util.Collections;

public class ReverseArrayUtil {
    public static void main(String[] args) {
        
        Integer [] array = {5,4,3,2,1}; 

        Collections.reverse(Arrays.asList(array));
        System.out.println(Arrays.asList(array));  // [1, 2, 3, 4, 5]
    }
}
