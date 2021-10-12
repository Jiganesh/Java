interface DemoOne {
	int number = 5;
}

interface DemoTwo extends DemoOne{
	void display();
}

class DemoClassOne implements DemoTwo {
	public void display() {
		System.out.println(number);
	}
}

class InterfaceTryout {
	public static void main(String[] args) {
		DemoTwo obj = new DemoClassOne();
		obj.display();
	}
}