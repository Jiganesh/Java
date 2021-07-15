class RecursionAssignment1 {
    
    public static int findFibonacci(int n) {
        //Implement your code here and change the return value accordingly
        
    if(n<=1){
        return 0;
    }else if (n<=2){
        return 1;
    }else{
        return findFibonacci(n-1)+findFibonacci(n-2);
    }

    }

    public static void main(String args[]) {
        int n = 3;
        if(n!=0)
            System.out.println(findFibonacci(n));
        else
            System.out.println("Please enter a valid value for n");
    }
}
