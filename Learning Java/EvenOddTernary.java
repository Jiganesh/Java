public class EvenOddTernary {
    public static void main(String[] args) {
        int number = 43;
        String result = (number%2==0) ? "Even": "Odd";
        // Ternary operator syntax -->(condition) ? if true : if false
        System.out.println(result);
    }
}
