// Find all the prime factors of Given Number

public class Q_PrimeFactorization {
    public static void main(String[] args) {

        int number = 45;

        // Reducing from small prime factors

        for (int i = 2; i * i <= number; i++) {

            while (number % i == 0) {
                System.out.println(i);
                number = number / i;
            }

            // if the number itself is prime factor we print it
            // eg for 45 we should get 3 3 now number is prime factor itself
            // so print 5

            if (number > 1) {
                System.out.println(number);
            }

            // Output will be 3 3 5 on new line, these are prime factors of 45

        }
    }
}