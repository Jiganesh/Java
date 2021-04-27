package Assignments;

public class IterationControlAssignment3 {
    public static void main(String[] args) {
        
        int number = 123;
        int foroutput =number;

        int sumofnumber=0;
        while(number>0){
            sumofnumber+=number%10;
            number=number/10;
        }
        String result =(foroutput%sumofnumber==0)?" is divisible ":" is not divisible ";
        System.out.println(foroutput+result+"by sum of its digits");
    }
}
