public class Patterns {
    public static void main(String[] args) {
        int x = 8;
        Pattern1(x);
    }

    public static void Pattern1(int number) {
        for (int i = 1; i <= number; i++) {
            for (int j = 0; j < 2 * (number - i); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < i; k++) {
                System.out.print("*   ");
            }
            System.out.println();
        }
    }
}
