import java.util.Scanner;

public class MaxPlacement {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int CSE = scan.nextInt();
        int ECE = scan.nextInt();
        int MECH = scan.nextInt();
        int[] array = {CSE, MECH, ECE};
        String [] branch ={"CSE","MECH","ECE"};

        if (ECE<0 || MECH<0 || CSE<0){ 
            System.out.println("Input is Invalid");
        }else if (CSE== MECH && MECH ==ECE){
            System.out.println("None of the department has got highest placement");
        }else{

            int max = 0;
            for (int i : array) {
                max =(i>max)?i:max;
            }
            System.out.println("Highest Placement :");

            for (int i = 0; i < branch.length; i++) {
                if (array[i]== max){
                    System.out.println(branch[i]);
                }
            }

        }
        scan.close();
    }
}
