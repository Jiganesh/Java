import java.util.Scanner;
import java.time.LocalDate;

public class DateTime {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        String[] value = a.split(" ");

        int month = Integer.parseInt(value[0]);
        int day = Integer.parseInt(value[1]);
        int year = Integer.parseInt(value[2]);

        LocalDate lt = LocalDate.of(year,month,day);
        System.out.printf(lt.getDayOfWeek().name());
        scanner.close();
    }
}