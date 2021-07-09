/*
class Order {
    private static int orderIdCounter;
	private int orderId;
	private Food[] orderedFoods;
    private Customer customer;
	private double totalPrice;
	private String status;
	

    static{
        orderIdCounter=101;
    }

    public Order(Food[] orderedFoods, Customer customer) {
        this.orderId = getOrderId();
		this.orderedFoods = orderedFoods;
        this.customer = customer;
		this.status = "Ordered";
	}

    	
	public static int getTotalNoOfOrders() {
		return Order.orderIdCounter-100;
	}

    // Getter and Setter for OrderId
    public static int getOrderId(){
        return orderIdCounter++;
    }

    public static void setOrderId(int orderId){
        orderIdCounter = orderId;
    }

    //Getter and Setter for customer
    public Customer getCustomer(){
        return this.customer;
    }
    public void setCustomer(Customer customer){
        this.customer = customer;
    }

    //Getter and Setter method for orderId
    public int getorderId(){
        return orderId;
    }

    public void setorderId(int orderId){
        this.orderId = orderId;
    }

    //Getter and Setter method for orderedFoods
    public Food[] getorderedFoods(){
        return orderedFoods;
    }

    public void setorderedFoods(Food[] orderedFoods){
        this.orderedFoods =orderedFoods;
    }

    //Getter and Setter method for totalPrice
    public double gettotalPrice(){
        return totalPrice;
    }

    public void settotalPrice(double totalPrice){
        this.totalPrice =totalPrice;
    }

    //Getter and Setter method for status
    public String getstatus(){
        return status;
    }

    public void setstatus(String status){
        this.status =status;
    }
	public Order() {
		this.status = "Ordered";
	}

	
	public Food[] getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
	}

    // calculateTotalPrice method with String parameter paymentMode return double
    public double calculateTotalPrice(String paymentMode) {
        this.totalPrice = 0.0;
        for (int i = 0; i < this.orderedFoods.length; i++) {
            this.totalPrice += this.orderedFoods[i].getUnitPrice();
        }
        return this.totalPrice;
    }    
}

class Food {
	private String foodName;
	private String cuisine;
	private String foodType;
	private int quantityAvailable;
	private double unitPrice;

    public Food(String foodName, String cuisine, String foodType , int quantityAvailable, double unitPrice){
        this.foodName=foodName;
        this.cuisine = cuisine;
        this.foodType =foodType;
        this.quantityAvailable=quantityAvailable;
        this.unitPrice=unitPrice;
    }

    // Getter and Setter methods for unitPrice
    public double getUnitPrice(){
        return this.unitPrice;
    }

    public void setUnitPrice(double unitPrice){
        this.unitPrice= unitPrice;
    }

    // Getter and Setter methods for foodName
    public String getfoodName(){
        return this.foodName;
    }

    public void setfoodName(String foodName){
        this.foodName= foodName;
    }

    // Getter and Setter methods for cuisine
    public String getcuisine(){
        return this.cuisine;
    }

    public void setcuisine(String cuisine){
        this.cuisine= cuisine;
    }

    // Getter and Setter methods for foodType
    public String getfoodType(){
        return this.foodType;
    }

    public void setfoodType(String foodType){
        this.foodType= foodType;
    }

    // Getter and Setter methods for quantityAvailable
    public int getquantityAvailable(){
        return this.quantityAvailable;
    }

    public void setquantityAvailable(int quantityAvailable){
        this.quantityAvailable= quantityAvailable;
    }
    
}

class Customer{

    public String customerId;
    public String customerName;
    long contactNumber ;
    public String Address;

    public Customer(){
        this.customerId = "";
    }

    public Customer(String customerId, String customerName, long contactNumber, String Address){
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.Address= Address;
    }

    public Customer(String customerName, long contactNumber, String Address ){
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.Address= Address;
    }

    //Getter and Setter methods for customerId
    public String getcustomerId(){
        return this.customerId;
    }
    public void setcustomerId(String customerId){
        this.customerId=customerId;
    }

    //Getter and Setter methods for customerName
    public String getcustomerName(){
        return this.customerName;
    }
    public void setcustomerName(String customerName){
        this.customerName=customerName;
    }
    
    //Getter and Setter methods for contactNumber
    public long getcontactNumber(){
        return this.contactNumber;
    }
    public void setcontactNumber(long contactNumber){
        this.contactNumber=contactNumber;
    }
    
    //Getter and Setter methods for Address
    public String getAddress(){
        return this.Address;
    }
    public void setAddress(String Address){
        this.Address=Address;
    }

    public void displayCustomerDetails(){
        System.out.printf("Customer Name is %s\n",this.customerName);
        System.out.printf("Contact Number is %d\n", this.contactNumber);
        System.out.printf("Address is %s\n", this.Address);

    }

    //payBill method
    public double payBill(double totalPrice){ 
        double bill = totalPrice * 0.1;
        return bill;
    }
}

class AggregationAssignment1 {
    public static void main(String[] args) {
        System.out.println("Constructed Code as told in Assignment");
    }
}
*/