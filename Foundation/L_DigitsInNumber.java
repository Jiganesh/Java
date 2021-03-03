import java.lang.Math;

public class L_DigitsInNumber {
    public static void main(String[] args) {

        int number = 2354;
        int divisor = (int) Math.pow(10, (int) Math.log10(number));

        while (number > 0) {
            System.out.println(number / divisor);
            number = number % divisor;
            divisor /= 10;
        }
    }
}
