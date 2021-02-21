// https://www.hackerrank.com/challenges/pattern-syntax-checker/problem

import java.util.regex.PatternSyntaxException;

public class TryAndCatch {
    public static void main(String[] args) {

        String s = "([A-Z])(.+)";
        String a = "[AZ[a-z](a-z)";

        System.out.println(ValidOrNot(s));
        System.out.println(ValidOrNot(a));
    }

    public static String ValidOrNot(String string) {

        try {
            java.util.regex.Pattern.compile(string);
            return "Valid";
        } catch (PatternSyntaxException e) {
            return "Invalid";
        }
    }
}
