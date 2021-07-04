
class EncapsulationAssignment2 {
    public static void main(String[] args) {
        MovieTicket movieTicket = new MovieTicket(112, 3);
        double amount = movieTicket.calculateTotalAmount();
        if (amount==0)
            System.out.println("Sorry! Please enter valid movie Id and number of seats");
        else
            System.out.println("Total amount for booking : $" + Math.round(amount*100)/100.0);
    }
}

class MovieTicket {

    private int movieId;
    private int noOfSeats;
    private double costPerTicket;

    public MovieTicket(int movieId, int noOfSeats){
        this.movieId = movieId;
        this.noOfSeats = noOfSeats;
    }

    public double calculateTotalAmount(){

        switch(this.movieId){
            case 111: costPerTicket=7; break;
            case 112: costPerTicket=8; break;
            case 113: costPerTicket=8.5; break;
            default: costPerTicket = 0;
        }

        double costwithouttax = this.noOfSeats*costPerTicket;
        return   costwithouttax + costwithouttax*2/100.0;

    }

    //Getter and Setter methods for movieId
    public void setmovieId(int movieId){
        this.movieId = movieId;
    }

    public int getmovieId (){
        return movieId;
    }

    //Getter and Setter methods for noOfSeats
    public void setnoOfSeats(int noOfSeats){
        this.noOfSeats = noOfSeats;
    }

    public int getnoOfSeats (){
        return noOfSeats;
    }

    //Getter and Setter methods for costPerTicket
    public void setcostPerTicket(double costPerTicket){
        this.costPerTicket = costPerTicket;
    }

    public double getcostPerTicket (){
        return costPerTicket;
    }
}

