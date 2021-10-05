public class stringsearch { 
    public static void main(String[] args) {
        System.out.println(evaluate("Roxannne"));
        System.out.println(evaluate("Manner"));
        System.out.println(evaluate("United States"));
        System.out.println(evaluate("HARD"));
        System.out.println(evaluate("softE"));
        System.out.println(evaluate("softer"));
    }

    public static String evaluate (String arr){

        return arr.toLowerCase().contains("r") ? arr : "NA";
    }
} 