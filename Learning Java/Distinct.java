public class Distinct{
    public static void main(String[] args) {
        
        String str = "abcddbbcbddbd";

        str.chars()
           .mapToObj(c -> (char)c)
           .distinct()
           .forEach(System.out::println);
    }
}

