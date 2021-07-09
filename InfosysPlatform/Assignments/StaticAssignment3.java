class Booking{
    //Implement your code here
    private String customerEmail;
    private int seatsRequired;
    private boolean isBooked;
    private static int seatsAvailable;

    static{
        seatsAvailable=400;
    }

    public Booking (String customerEmail, int seatsRequired){
        this.customerEmail=customerEmail;
        this.seatsRequired = seatsRequired;

        if(seatsRequired<=seatsAvailable){
            this.isBooked=true;
            setSeatsAvailable(seatsAvailable-seatsRequired);
        }else{
            this.isBooked=false;
        }
    }

    // Getter and Setter method for CustomerEmail
    public String getCustomerEmail(){
        return this.customerEmail;
    }
    public void setCustomerEmail(String customerEmail){
        this.customerEmail=customerEmail;
    }

    //Getter and Setter methods for seatsRequired
    public int getSeatsRequired(){
        return this.seatsRequired;
    }
    public void setSeatsRequired(int seatsRequired){
        this.seatsRequired=seatsRequired;
    }

    public boolean isBooked(){
        return this.isBooked;
    }

    public void setBooked(boolean isBooked){
        this.isBooked = isBooked;
    }

    public static int getSeatsAvailable(){
        return seatsAvailable;
    }
    public static void setSeatsAvailable  (int seatsAvailable){
        Booking.seatsAvailable= seatsAvailable;
    }

}

class StaticAssignment3{
    public static void main(String[] args) {
        Booking booking1 = new Booking("jack@email.com", 100);
        Booking booking2 = new Booking("jill@email.com", 350);

        //Create more objects and add them to the bookings array for testing your code
        
        Booking[] bookings = { booking1, booking2 };
              
        for (Booking booking : bookings) {
            if (booking.isBooked()) {
                System.out.println(booking.getSeatsRequired()+" seats successfully booked for "+booking.getCustomerEmail());
            }
            else {
                System.out.println("Sorry "+booking.getCustomerEmail()+", required number of seats are not available!");
                System.out.println("Seats available: "+Booking.getSeatsAvailable());
            }
         }
    }
}

