import java.lang.Math;

public class O_RotateTheNumber {
    public static void main(String[] args) {

        int number = 123456;
        int rotate = 9;

        int totaldigits = (int) Math.log10(number) + 1;
        rotate = rotate % totaldigits;
        // if number has 6 digits and we have to rotate by 9
        // it will give same result for 3 rotations, optimization

        int distributer = (int) Math.pow(10, rotate);
        // we using distributer to cut the number 123 / 456

        int move = number % distributer; // move = 456
        number = number / distributer;   // number = 123

        int nod = (int) Math.log10(number) + 1;
        // number of digits in number part to get a multiplier

        int result = move * (int) Math.pow(10, nod) + number;
        // result = 456 * 1000 + 123 = 456123

        System.out.println(result); // 456123
    }
}