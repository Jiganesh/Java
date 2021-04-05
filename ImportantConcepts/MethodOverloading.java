// Method Overloading

// Multiple methods can have the same name with different parameters

public class MethodOverloading {
    public static void main(String[] args) {

        int m = plusMethod(4, 5);
        double u = plusMethod(4.5, 8.5);

        System.out.println(m);
        System.out.println(u);

    }

    public static int plusMethod(int x, int y) {
        return x + y;
    }

    public static double plusMethod(double x, double y) {
        return x + y;
    }

}

// Instead of defining two methods that should do the same thing, it is better to overload one.
// In the example below, we overload the plusMethod method to work for both int and double
