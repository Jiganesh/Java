public class U_DigitFrequency {
    public static void main(String[] args) {
        
        int number = 379698799;  // Given Number to find digit frquency from

        int target = 9; // Target digit whose frequency has to be found

        int count =0; // To store the frequency

        while(number>0){

            if (target == number%10){

                count+=1;
            }

            number=number/10;
        }
        System.out.println(count);
    }
}
