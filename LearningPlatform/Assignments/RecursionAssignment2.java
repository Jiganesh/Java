class RecursionAssignment2 {

    public static double findHPSum(int num) {
        //Implement your code here and change the return value accordingly
        
        if (num==1){
            return 1.0;
        }else {
            return 1.0/((double)num) + findHPSum(num-1);
        }
    }
    
    public static void main(String args[]) {
        System.out.println(findHPSum(3));
    }
}
