public class R_GCDandLCM {
    public static void main(String[] args) {

        int number1 = 45;
        int number2 = 9;

        System.out.println(gcd(number1, number2));
        System.out.println(lcm(number1, number2));
    }

    // The Euclidean Algorithm for finding GCD(A,B) is as follows:
    // If A = 0 then GCD(A,B)=B, since the GCD(0,B)=B, and we can stop.
    // If B = 0 then GCD(A,B)=A, since the GCD(A,0)=A, and we can stop.
    // Write A in quotient remainder form (A = B⋅Q + R)
    // Find GCD(B,R) using the Euclidean Algorithm since GCD(A,B) = GCD(B,R)

    public static int gcd(int a, int b) {

        if (b == 0) {
            return a;
        } else {
            return gcd(b, a % b);
        }

    }

    // Property : LCM × GCD is equal to the product of two given numbers.

    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
}
