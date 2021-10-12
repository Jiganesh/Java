
class Calculators {

	// Implement your code here
	public int num;
	
	public int sumOfDigits(){
	   int result =0;
	   while (num>0){
	       result+=num%10;
	       num=num/10;
	   }
	   return result;
	}

}

class MethodsAssignment3 {

	public static void main(String args[]) {

		Calculators calculator = new Calculators();

		// Assign a value to the member variable num of Calculator class
		calculator.num =123;
		// Invoke the method sumOfDigits of Calculator class and display the output
		int a =calculator.sumOfDigits();
		System.out.println(a);

	}
}