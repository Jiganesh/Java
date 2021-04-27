package OOPS;

class Demo {
	public int var1; // Instance variable of the class

	public void printValue() {
		int var2 = 20; // Local variable of the method
		System.out.println(var1);
		System.out.println(var2); // Local variable is accessible only inside the method
	}
}

public class LocalVariablesTryout {
    public static void main(String args[]) {
		Demo demo = new Demo();
		demo.var1 = 10; // Instance variable can be accessed from outside the
						// class with the help of object
		demo.printValue();

		// Local variables cannot be accessed outside a method
		// Below lines will lead to a compilation error saying that var2 is not
		// a field or variable
		// System.out.println(demo.var2);
		// System.out.println(var2);
	}
}

