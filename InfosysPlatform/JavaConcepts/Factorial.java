class Factorial {
	public static void main(String[] args) {
		// Implement your code here 
		int number = 7;
		int factorial =1;
		while (number>0){
		    factorial*=number;
		    number-=1;
		}
		System.out.println(factorial);
	}
}