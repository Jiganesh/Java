import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {

        String delimiter = "-";
        String prefix = "[";
        String suffix = "]";

        String [] array = {"Follow","Like","Share"};

        StringJoiner result = new StringJoiner(delimiter, prefix, suffix);

        for (String string : array) {
            result.add(string);         
        }

        System.out.println(result);
    }
}

  