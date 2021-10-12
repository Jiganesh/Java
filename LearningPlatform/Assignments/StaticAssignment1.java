/*
class Order {
    private static int orderIdCounter;
	private int orderId;
	private Food[] orderedFoods;
	private double totalPrice;
	private String status;
	

    static{
        orderIdCounter=101;
    }

    // Getter and Setter for OrderId
    public static int getOrderId(){
        return orderIdCounter++;
    }

    public static void setOrderId(int orderId){
        orderIdCounter = orderId;
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
	
	public Order(Food[] orderedFoods) {
        this.orderId = getOrderId();
		this.orderedFoods = orderedFoods;
		this.status = "Ordered";
	}
	
	public static int getTotalNoOfOrders() {
		return Order.orderIdCounter-100;
	}
	
	public Food[] getOrderedFoods() {
		return orderedFoods;
	}
	public void setOrderedFoods(Food[] orderedFoods) {
		this.orderedFoods = orderedFoods;
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

class StaticAssignment1{
    public static void main(String[] args) {

        System.out.println("Just Solved the Assignment");
        System.out.println("Actually assignment did not had clear instruction.");
        System.out.println("I have done what is asked and not written testcases");

        
    }
}
*/