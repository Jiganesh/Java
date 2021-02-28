public class StringToInt {
    public static void main(String[] args) {

        String str = "-004323";

        int method1 = Integer.parseInt(str);

        int method2 = Integer.valueOf(str);

        System.out.printf("%d  %d", method1, method2); // -4323 -4323

        // If all characters in String not digits then we get NumberFormatException.
        // '-' as first character is allowed.

        /*
         * Difference between Integer.valueOf() and Integer.parseInt(), 
         * the valueOf(String) method returns an object of Integer class, 
         * the parseInt(String) method returns a primitive int value.
         */
    }
}
