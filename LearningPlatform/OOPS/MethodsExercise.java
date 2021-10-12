
public class MethodsExercise {

	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		// Invoke the method findAverage of the Calculator class and display the average
		double average = calculator.findAverage(12,8,15);
		System.out.println(average);
	}
}

class Calculator {
	// Implement your code here
	public double findAverage(int number1, int number2, int number3){
	    double result;
		result = ((double)(number1)+(number2)+(number3))/3;
		
        return (double)Math.round(result*100)/100;
	  
	}
}
