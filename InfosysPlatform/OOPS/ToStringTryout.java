class Food {

	private String foodName;
	private String cuisine;
	private String foodType;
	private int quantityAvailable;
	private double unitPrice;

	public String getFoodName() {
		return foodName;
	}

	public void setFoodName(String foodName) {
		this.foodName = foodName;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getQuantityAvailable() {
		return quantityAvailable;
	}

	public void setQuantityAvailable(int quantityAvailable) {
		this.quantityAvailable = quantityAvailable;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	// equals method of Object class overridden for comparing two Food objects
	// based on foodName and foodType
	@Override
	public boolean equals(Object obj) {
		Food otherFood = (Food) obj;
		if (this.foodName.equals(otherFood.foodName)) {
			if (this.foodType.equals(otherFood.foodType))
				return true;
		}
		return false;
	}

	// hashCode method overridden
	@Override
	public int hashCode() {
		int result = 1;
		result = result + (foodName.hashCode());
		return result;
	}

	// toString is overridden to provide a custom textual representation
	@Override
	public String toString() {
		return "Food -> " + "Food name: " + this.foodName + ", Cuisine: "
				+ this.cuisine + ", Food type: " + this.foodType
				+ ", Quantity avaialable: " + this.quantityAvailable
				+ ", unitPrice: " + unitPrice;

		
	}
}

class ToStringTryout {

	public static void main(String[] args) {
		Food foodOne = new Food();
		foodOne.setFoodName("Sandwich");
		foodOne.setCuisine("Continental");
		foodOne.setFoodType("Veg");
		foodOne.setQuantityAvailable(100);
		foodOne.setUnitPrice(10);

		// Comment the toString() in the Food class and execute the code
		System.out.println(foodOne);
	}
}