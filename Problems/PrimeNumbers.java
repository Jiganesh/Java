import java.util.Scanner;

class PrimeNumbers{
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();

        if (start>0 && end >0 && start <=end){
            for (int i = start; i<=end ; i++){
                if(prime(i)) System.out.print(i+" ");
            }

        }else{
            System.out.println("Provide Valid Input");
        }
        scan.close();
        

    }

    public static boolean prime(int n){
        for (int i = 2; i < Math.pow(n, (1 / 2) + 1); i++){
            if( n%i==0) return false;
        }
        return true;
    }
}