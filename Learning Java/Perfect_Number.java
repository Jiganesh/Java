import java.util.Scanner;

class Perfect_Number {
    public static void main(String[] args){
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number : ");
        n = sc.nextInt();
        boolean b = isPerfect(n);
        if(b == true){
            System.out.println("Entered Number is Perfect");
        }else{
            System.out.println("Entered Number is Not Perfect");
        }
        sc.close();
    }    

    static boolean isPerfect(int n){
        int sum = 1;
        for(int i=2;i*i<=n;i++){
            if(n%i == 0){
                if(i*i!=n){
                    sum = sum + i + n/i;
                }else{
                    sum = sum + i;
                }
            }
        }
        if(sum == n && n!=1){
            return true;
        }

        return false;
    }
}