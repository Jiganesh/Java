public class Sequence {
    public static void main(String[] args) {
		// Implement your code here
		int number = 1;
		int times = 8;
		while (times>0){
		    
		    System.out.print(number+ " ");
		    number=(number<<1);
		    times-=1;
		}
		
	}
}
