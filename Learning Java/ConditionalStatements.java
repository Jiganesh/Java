public class ConditionalStatements {
    public static void main(String[] args) {
        int age = 14;
        int year_gap = 19;

        if (age >= 18 || year_gap == 18) {
            System.out.println("Valid Age");
        } else if (age < 18 && year_gap == 18) {
            System.out.println("Not Valid Age");
        } else {
            System.out.println("Not Human");
        }

        // short hand for writing if else condition
        // Ternary Operators

        int a = 10;
        int b = 20;
        int maxofboth = a > b ? a : b;
        System.out.println(maxofboth);
    }
}
