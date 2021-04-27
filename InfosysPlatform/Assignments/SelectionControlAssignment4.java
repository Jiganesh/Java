package Assignments;

import java.util.Scanner;

public class SelectionControlAssignment4 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String foodtype = scan.nextLine();
        int Quantityordered= scan.nextInt();
        int distance = scan.nextInt();

        int totaldistancecost;

        if (distance<=3){
            totaldistancecost=0;
        }else if(distance<=6){
            totaldistancecost= distance%3*1;
        }else{
            totaldistancecost = 0+3+(distance-6)*2;
        }
        int food;

        if(!(foodtype.equals("N") || foodtype.equals("V"))&& Quantityordered<1 && distance<0){
            System.out.println(-1);
        }else{
            if (foodtype.equals("N")){
                food=15;
            }else{
                food =12;
            }
            int totalfoodcost = food*Quantityordered;
            System.out.println(totaldistancecost+totalfoodcost);
        }
        
        scan.close();
    }
}
