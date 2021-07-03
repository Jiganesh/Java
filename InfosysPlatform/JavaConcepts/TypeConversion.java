public class TypeConversion {
    public static void main(String[] args) {

        int variableOne = 10;
        float variableTwo = variableOne;
        System.out.println(variableOne);
        System.out.println(variableTwo);
        // Here, a variable of data type having smaller range is automatically
        // accommodated in a variable of data type having bigger range. This is
        // known as widening.

        // When we try to accommodate a variable of data type having bigger
        // range into a data type having smaller range, it leads to an error.
        float variableThree = 12.5f;
       // int variableFour = variableThree; // comment this line or fix the error
                                          // to execute the code successfully
        System.out.println(variableThree);
       // System.out.println(variableFour); // comment this line or fix the error
                                          // to execute the code successfully

        // Since our assignment is leading to loss of data, we need to
        // explicitly specify that the data needs to be converted to a data type
        // having smaller range.
        // This is known as explicit typecasting.
        int variableFive = (int) variableThree;
        System.out.println(variableFive);
    }

}
