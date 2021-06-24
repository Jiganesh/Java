public class MethodsAssignment2 {
    public static void main(String[] args) {
        Restaurant R1 = new Restaurant("McDonalds",9988676767L,"Texas",4.1F);
        R1.displayRestaurantDetails();
    }   
}

class Restaurant{
    
    String restaurantName;
    long restaurantContact;
    String restaurantAddress;
    float rating;

    public Restaurant(String restaurantName , long restaurantContact, String restaurantAddress, float rating){
        this.restaurantName= restaurantName;
        this.restaurantContact=restaurantContact;
        this.restaurantAddress= restaurantAddress;
        this.rating=rating;

    }

    public void displayRestaurantDetails(){
        System.out.println("Restaurant Details\n--------------------------");
        System.out.printf("Restaurant Name: %s\nRestaurant Rating: %f\nRestaurant Contact: %d\nRestaurant Address: %s",this.restaurantName,this.rating,this.restaurantContact,this.restaurantAddress);
    }
}
