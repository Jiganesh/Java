
public class IterationControlAssignment4 {
    public static void main(String[] args) {
        int number = 45;
        int tocheck =1000;
        int seed=number;

        while(number>0){
            seed *= number%10;
            number/=10;
        }

        if(seed==tocheck){
            System.out.println("The given number is seed of "+tocheck);
        }else{
            System.out.println("The given number is not seed of "+tocheck );
        }
    }
}
