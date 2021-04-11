public class MinMaxInString {
    public static void main(String[] args) {
        
    String numbers = "1 2 3 -3 5 9 8 -2";

    System.out.println("The Minimum and Maximum Numbers in String are "+MinMax(numbers)+" respectively");

    }

    static String MinMax(String numbers){

        String result ="";
        
        String [] num = numbers.split(" ");
        int maximum = Integer.parseInt(num[0]);
        int minimum = Integer.parseInt(num[0]);

        for (int i =1; i<num.length; i++){
            int n = Integer.parseInt(num[i]);

            if (n> maximum){
                maximum = n;
            }
            if (n< minimum){
                minimum=n;
            }
        }
        result = maximum+" "+minimum;
        return result;

    }
}
