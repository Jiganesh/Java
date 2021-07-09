public class Tester {
    public static void main(String[] args) {

        double targetValue = 4.85 * 7.9234f * 5.32232;

        System.out.println(targetValue); //204.52871896679306
          
        double roundedValue = Math.round(targetValue *100)/ 100;
          
        System.out.println(roundedValue);

    }
}