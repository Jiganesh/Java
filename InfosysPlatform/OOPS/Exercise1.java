
public class Exercise1 {
    public static void main(String[] args) {
        Food fooditem = new Food() ;

        fooditem.displayDetails();
    }

}

class Food{
    public String foodName;
    public String cuisine;
    public String foodType;
    public int quantityAvailable;
    public double unitPrice;

    public void displayDetails(){
        System.out.println("The foodName is: "+ foodName);
        System.out.println("The cuisine is : "+ cuisine);
        System.out.println("The foodtype is :"+ foodType);
        System.out.println("The quantity availble :"+quantityAvailable);
        System.out.println("The unitPrice is: "+unitPrice);
    }
}
