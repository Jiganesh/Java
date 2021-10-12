public class ArrayExercise1 {
    public static int calculateSumOfEvenNumbers(int[] numbers){
        int sum =0;
        for (int i : numbers){
            if(i%2==0) sum+=i;
        }
        return sum;
    }
    
	public static void main(String[] args) {
		int[] numbers = {68,79,86,99,23,2,41,100};
		System.out.println("Sum of even numbers: " +calculateSumOfEvenNumbers(numbers));
	}
}
