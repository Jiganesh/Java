import java.util.Scanner;

public class G_TakingInput {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int i = Integer.parseInt(scan.nextLine());
        String s = scan.nextLine();

        System.out.println(i+" "+s);
        scan.close();


    }
}
