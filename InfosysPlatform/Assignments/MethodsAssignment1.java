/*
public class MethodsAssignment1 {
    public static void main(String[] args) {

        Order O1 = new Order(101,"Spinach Alfredo Pasta", 35.0, "Ordered");
        System.out.println(O1.orderId);
        System.out.println(O1.orderedFoods);
        System.out.println(O1.totalPrice);
        System.out.println(O1.status);
        System.out.println(O1.calculateTotalPrice(100));
        
    }
}

class Order{

    int orderId ; 
    String orderedFoods;
    double totalPrice;
    String status;


    public Order(int orderId , String orderedFoods, double totalPrice, String status){
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
*/