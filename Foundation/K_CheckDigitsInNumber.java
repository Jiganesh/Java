import java.lang.Math;

public class K_CheckDigitsInNumber{
    public static void main(String[] args) {
        
        // Naive Approach
        int number = 345343;
        int numberOfDigits =0;

        while (number>0){
            numberOfDigits++;
            number = number/10;
        }

        System.out.println(numberOfDigits); // 6 


        // Better Approach
        number = 345343;
        numberOfDigits =(int) Math.log10(number)+1;

        System.out.println(numberOfDigits); // 6
    }
}