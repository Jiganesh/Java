// Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7, consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.

// Note: Only one of the three values can be 7.



public class SelectionControlAssignment3 {
    public static void main(String[] args) {
        // Implement your code here
        int a = 1, b = 5, c = 3;
        int result = 1;

        if (c == 7) {
            result = -1;
        } else if (b == 7) {
            result = c;
        } else if (a == 7) {
            result = b * c;

        } else {
            result = a * b * c;
        }
        System.out.println(result);
    }
}
