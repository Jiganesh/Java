

import java.util.Scanner;

public class SelectionControlAssignment8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        if (num%15==0){
            System.out.println("Zoom");
        }else if(num%5==0){
            System.out.println("Zap");
        }else if(num%3==0){
            System.out.println("Zip");
        }else{
            System.out.println("Invalid");
        }
        scan.close();
    }
}