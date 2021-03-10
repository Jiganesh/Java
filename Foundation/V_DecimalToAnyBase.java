public class V_DecimalToAnyBase {
    public static void main(String[] args) {

        int number = 10;

        // Decimal to Binary, Octal, Hexadecimal Conversions
        Integer.toBinaryString(number); // 1010
        Integer.toOctalString(number);  // 12
        Integer.toHexString(number);    // a


        // Binary, Octal, Hexadecimal to Decimal Conversions
        Integer.parseInt("10101010", 2);  // 170
        Integer.parseInt("17", 8);        // 15
        Integer.parseInt("A", 16);        // 10

    }
}
