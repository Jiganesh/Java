public class BitwiseOperators {

    public static void main(String args[]) {
        // Shift operator (<< and >>) is used to move the left operands value by
        // the number of bits specified.
        int a = 10; // 1010
        int b = 20; // 10100
        System.out.println(a << 2); // left-shift operator moves the value to
                                    // the left side

        System.out.println(b >> 3); // right-shift operator moves the value to
                                    // the right side

        // Unsigned right shift operator(>>>)
        System.out.println(a >> 2);
        System.out.println(a >>> 2);
        // works in the same way for positive numbers

        int c = -1;
        System.out.println(c >> 2);
        System.out.println(c >>> 2);

        // There is no unsigned left shift operator(<<<). The below line leads
        // to an error
        // System.out.println(a<<<2);

        // Bitwise operators are used to perform manipulation of individual bits

        // Logical OR(||) does not check second condition if first is true
        // Bitwise OR(|) always checks both conditions even if first condition
        // is true or false
        System.out.println(a | b);

        // Logical AND(&&) does not check second condition if first is false
        // Bitwise AND(&) checks both conditions even if first condition is true
        // or false
        System.out.println(a & b);
    }
}
