import java.util.Scanner;

public class TakingInput {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int x = scan.nextInt();
        String sentence = scan.nextLine();

        System.out.println(sentence);
        System.out.println(x);
        
        scan.close(); // If u dont do this you will get resource leak
    }
}
