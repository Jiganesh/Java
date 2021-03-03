public class N_InverseANumber {
    public static void main(String[] args) {

        int n = 21453;
        int result = 0;
        int op = 1;

        while (n > 0) {

            int od = n % 10;
            int ip = od;
            int id = op;

            result += id * (int) Math.pow(10, ip - 1);

            n = n / 10;
            op++;
        }
        System.out.println(result);

    }
}
