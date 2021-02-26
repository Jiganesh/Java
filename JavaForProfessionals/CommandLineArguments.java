public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length <1){
            System.err.println("<arg>");
        }else{
            for (String string : args) {
                System.out.println(string);
            }
        }
    }
}

// javac CommandLineArguments.java
// java CommandLineArguments Hello 1 2 3 Bitcoin

