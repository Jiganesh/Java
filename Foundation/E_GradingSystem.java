import java.util.Scanner;

public class E_GradingSystem {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner (System.in);
        int marks = scan.nextInt();

        String result = (marks > 90) ?"Excellent":(marks >80)?"Good":(marks>70)? "Fair":(marks>60)? "Meets Expectation":"Below par";
        
        System.out.println(result);
        scan.close();
    }
}
