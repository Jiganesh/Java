package Assignments;

public class IterationControlAssignment2 {
    public static void main(String[] args) {
        
        int heads = 3;
        int legs = 11;

        int numberofchicken =0;
        int numberofrabbit =(heads-numberofchicken);

        while(4*numberofrabbit+2*numberofchicken !=legs){
            if(numberofchicken>=heads){
                System.out.println("Not possible");
                System.exit(0);
                
            }
            numberofchicken++;
            numberofrabbit--;
        }

        System.out.println("number of chicken "+numberofchicken );
        System.out.println("number of rabbit "+numberofrabbit );

    }
}
