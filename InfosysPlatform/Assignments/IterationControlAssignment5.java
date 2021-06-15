
public class IterationControlAssignment5 {
    public static void main(String[] args) {
        
        int number = 1635;
        int tocheck =number;
        int length = String.valueOf(number).length();

        int result =0;
        while(number>0){
           result+= Math.pow(number%10, length);
           number/=10;
        }

        if (result==tocheck){
            System.out.println(tocheck +" is a armstrong number");
        }else{
            System.out.println(tocheck+" is not a armstrong number");
        }

    }
}
