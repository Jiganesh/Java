package Assignments;

public class IterationControlAssignment6 {
    public static void main(String[] args) {
        int number= 15;
        String n = String.valueOf(number);
        int i = 1;
        int result =0;
    
        while (i<n.length()){
            if (i%2==0){
                result+= Math.pow(Integer.parseInt(String.valueOf(n.charAt(i-1))), 2);
            }
            i++;
        }
        
        if(result%9==0){
            System.out.println("Lucky Number");
        }else{
            System.out.println("Not Lucky Number");
        }
    }
}
