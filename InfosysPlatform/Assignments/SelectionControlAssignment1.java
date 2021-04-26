// Implement a program to display the sum of two given numbers if the numbers are same. 
// If the numbers are not same, display the double of the sum.

package Assignments;

public class SelectionControlAssignment1 {
    public static void main(String[] args) {
        // Implement your code here
        int number1 = 6;
        int number2 = 5;
        System.out.println((number1 == number2) ? number1 + number2 : 2 * (number1 + number2));
    }
}
