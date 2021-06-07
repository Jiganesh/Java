public class sumEvens {
    public static void main(String[] args) {
        System.out.println(sumEven(5));
    }

    public static int  sumEven(int N) {
        int result=0;
        for(int i=0 ; i<=N ;i+=2){
            result+=i;
        }
        return result;
    }
}
