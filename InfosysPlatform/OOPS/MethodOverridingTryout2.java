class MethodOverridingTryout2 {
	public static void main(String args[]) {
		Bank bank;
		bank = new ABCBank();
		System.out.println("ABCBank - Rate of Interest(%): "
				+ bank.getRateOfInterest());
		bank = new DEFBank();
		System.out.println("DEFBank - Rate of Interest(%): "
				+ bank.getRateOfInterest());
		bank = new GHIBank();
		System.out.println("GHIBank - Rate of Interest(%): "
				+ bank.getRateOfInterest());
	}
}

class Bank {
	public float getRateOfInterest() {
		return 0;
	}
	// remove the access specifier and observe the output
}

class ABCBank extends Bank {
	public float getRateOfInterest() {
		return 8.99f;
	}
	// Keeping the parent access specifier as public, remove the child access
	// specifier and observe the output
}

class DEFBank extends Bank {
	public float getRateOfInterest() {
		return 9.4f;
	}
	// Keeping the parent access specifier as public, change the child access
	// specifier to private/protected and observe the output
}

class GHIBank extends Bank {
	public float getRateOfInterest() {
		return 8.1f;
	}
}
