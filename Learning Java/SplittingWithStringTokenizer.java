import java.util.StringTokenizer;

public class SplittingWithStringTokenizer {
    public static void main(String[] args) {

        String string = "Follow       Like   and       Share";
        String delimiter = " \\s+";

        StringTokenizer tokens = new StringTokenizer(string, delimiter);

        while (tokens.hasMoreTokens()) {

            System.out.println(tokens.nextToken());

        }
    }
}