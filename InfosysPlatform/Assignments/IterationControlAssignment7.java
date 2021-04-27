package Assignments;

public class IterationControlAssignment7 {
    public static void main(String[] args) {

        System.out.println(lcm(5,10));
        System.out.println(lcm(7, 9));
    }

    public static int gcd(int num1, int num2) {
        
        if (num2==0){
            return num1;
        }else{
            return gcd(num2,num1%num2);
        }
        
    }

    public static int lcm(int num1, int num2){
        return num1*num2/gcd(num1, num2);
    }
}
