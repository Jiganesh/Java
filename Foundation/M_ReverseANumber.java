public class M_ReverseANumber {
    public static void main(String[] args) {

        int number = 123456789;
        int result = 0;

        while (number > 0) {

            result = result * 10 + number % 10;
            number = number / 10;
        }
        System.out.println(result); // 987654321
    }
}
