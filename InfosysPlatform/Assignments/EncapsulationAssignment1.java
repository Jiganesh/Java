public class EncapsulationAssignment1 {
    
    public static void main(String[] args) {

        Orders O1 = new Orders(101,"Spinach Alfredo Pasta", 35.0, "Ordered");
        System.out.println(O1.getorderId());
        System.out.println(O1.getorderedFoods());
        System.out.println(O1.gettotalPrice());
        System.out.println(O1.getstatus());
        System.out.println(O1.calculateTotalPrice(100));
        
    }
}

class Orders{

    private int orderId ; 
    private String orderedFoods;
    private double totalPrice;
    private String status;


    //Getter and Setter method for orderId
    public int getorderId(){
        return orderId;
    }

    public void setorderId(int orderId){
        this.orderId = orderId;
    }

    //Getter and Setter method for orderedFoods
    public String getorderedFoods(){
        return orderedFoods;
    }

    public void setorderedFoods(String orderedFoods){
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



    public Orders(int orderId , String orderedFoods, double totalPrice, String status){
        this.orderId = orderId;
        this.orderedFoods= orderedFoods;
        this.totalPrice= totalPrice;
        this.status= status;
    }

    public double calculateTotalPrice(int unitPrice){
        double result = unitPrice * 1.05;
        return result;

    }
}