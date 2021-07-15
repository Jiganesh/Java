class RecursionAssignment3 {

    public static int findGCD(int num1, int num2) {
        //Implement your code here and change the return value accordingly
        
        if (num2==0){
            return num1;
        }else{
            return findGCD(num2, num1%num2);
        }
    }
    
    public static int findMax(int num1, int num2) {
        return (num1 > num2 ? num1 : num2);
    }

    public static int findMin(int num1, int num2) {
        return (num1 < num2 ? num1 : num2);
    }

    public static void main(String args[]) {
        System.out.println(findGCD(5, 10));
    }
}
