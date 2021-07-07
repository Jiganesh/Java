public class AggregationExercise1 {
        
    public static void main(String[] args) {
        Address address = new Address("1001","Street No-3","Karad",4155539);
        CustomerForAggregation C1=  new CustomerForAggregation("Jiganesh Patil",9075735639L, address);
        C1.displayDetails();
   
    }
}

class CustomerForAggregation{

    public String customerName;
    long contactNumber ;
    public Address address;

    public CustomerForAggregation(String customerName, long contactNumber, Address address){

        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.address= address;
    }

    public void displayDetails(){
        System.out.printf("Customer Name is %s\n",this.customerName);
        System.out.printf("Contact Number is %d\n", this.contactNumber);
        this.address.displayDetails();

    }
}

class Address{
    public String doorNo;
    public String street;
    public String city;
    public int zipcode;

    public Address(String doorNo, String street, String city, int zipcode){
        this.doorNo= doorNo;
        this.city= city;
        this.street= street;
        this.zipcode= zipcode;
    }

    
    public void displayDetails(){
        System.out.printf("Address DoorNo : %s\n",this.doorNo);
        System.out.printf("Address StreetNO : %s \n", this.street);
        System.out.printf("Address city: %s - %d ", this.city , this.zipcode);

    }
}

// I have not set member variable to private as i would be needed write getter and setter methods
// I am very lazy to do that please consider doing that tedious work on yourself
// also I have changed class name as there was conflict in here with another Customer class defined .

