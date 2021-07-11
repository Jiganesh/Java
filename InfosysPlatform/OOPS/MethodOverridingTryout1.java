/*
class MethodOverridingTryout1    {

	public static void main(String[] args) {

		 Customer customer = new Customer();
		 System.out.println("Final bill amount: "+customer.payBill(40.0));
		//Parent Reference -> Parent Object

		RegularCustomer regularCustomer = new RegularCustomer();
		 System.out.println("Final bill amount: "+regularCustomer.payBill(40.0));
		// Child Reference -> Child Object

		Customer regCust = new RegularCustomer();
		// Parent Reference -> Child Object
		System.out.println("Final Bill : " + regCust.payBill(40.0)); 
	}
}

class Customer {

	public double payBill(double totalPrice) {
		System.out.println("Final bill for the customer is calculated here");
		return totalPrice;
	}
}

class RegularCustomer extends Customer {

	@Override
	public double payBill(double totalPrice) {
		System.out.println("Final bill for the regular customer is calculated here");
		double priceAfterDiscount = totalPrice * (1 - (5f / 100));
		return priceAfterDiscount;
	}

}
*/