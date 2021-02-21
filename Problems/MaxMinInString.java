import java.util.Arrays;

public class MaxMinInString {

    public static void main(String[] args) {
        System.out.println( naive_way("1 2 3 4 5 6 7"));
        System.out.println( better_way("7 6 5 4 3 2 1"));
    }
    public static String better_way(String numbers){
        int min = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .min()
                        .getAsInt();
        
        int max = Arrays.stream(numbers.split(" "))
                        .mapToInt(i -> Integer.parseInt(i))
                        .max()
                        .getAsInt();

        return String.format("%d %d",max, min);

    }
    public static String naive_way(String numbers) {
        String[] array = numbers.split(" ");
        int max = -999;
        int min = 999;
        for (int i = 0; i < array.length; i++) {
            int num = Integer.parseInt(array[i]);
            max = (max < num) ? num : max;
            min = (min > num) ? num : min;
        }
        return max + " "+ min;
    }
}
