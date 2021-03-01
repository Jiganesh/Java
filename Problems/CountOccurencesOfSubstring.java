import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CountOccurencesOfSubstring {
    public static void main(String[] args) {
        String text = "One fish, two fish, red fish, blue fish";
        System.out.println(countStringInString("fish", text)); // prints 4
        System.out.println(countStringInString(",", text)); // prints 3
    }

    public static int countStringInString(String search, String text) {
        Pattern pattern = Pattern.compile(search);
        Matcher matcher = pattern.matcher(text);
        int stringOccurrences = 0;
        while (matcher.find()) {
            stringOccurrences++;
        }
        return stringOccurrences;
    }
}
