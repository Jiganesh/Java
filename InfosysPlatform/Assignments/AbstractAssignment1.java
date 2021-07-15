/*
abstract class Payment{
    //Implement your code here
    private int customerId;
    protected String paymentId;
    protected double serviceTaxPercentage;

    public Payment (int customerId){
        this.customerId = customerId;
    }

    //Getter and Setter customerId
    public int getCustomerId(){
        return this.customerId;
    }

    public void setCustomerId(int customerId){
        this.customerId = customerId;
    }

    //Getter and Setter paymentId
    public String getPaymentId(){
        return this.paymentId;
    }

    public void setPaymentId(String paymentId){
        this.paymentId = paymentId;
    }

    //Getter and Setter serviceTaxPercentage
    public double getServiceTaxPercentage(){
        return this.serviceTaxPercentage;
    }

    public void setServiceTaxPercentage(double serviceTaxPercentage){
        this.serviceTaxPercentage = serviceTaxPercentage;
    }

    public abstract double payBill(double amount);
}

class DebitCardPayment extends Payment{
    //Implement your code here
    private static int counter=1000;
    private double discountPercentage;

    static{
        counter = 1001;
    }

    public DebitCardPayment (int customerId){
        super(customerId);
        this.paymentId = "D" + getCounter();
    }

    public double payBill(double amount){
        if (amount<=500){
            setServiceTaxPercentage(2.5);
            setDiscountPercentage(1);
        }else if(amount>500 && amount<=1000){
            setServiceTaxPercentage(4);
            setDiscountPercentage(2);
        }else if(amount>1000){
            setServiceTaxPercentage(5);
            setDiscountPercentage(3);
        }

        double serviceTaxAmount =(amount * getServiceTaxPercentage())/100.0;
        double discountAmount = (amount * getDiscountPercentage())/100.0;

        return amount+ serviceTaxAmount - discountAmount;
    }

    //Getter and Setter methods for discountPercentage
    public double getDiscountPercentage(){
        return this.discountPercentage;
    }

    public void setDiscountPercentage(double discountPercentage){
        this.discountPercentage = discountPercentage;
    }

    //Getter and Setter methods for counter
    public static int getCounter(){
        return counter++;
    }

    public static void setCounter(int counter){
        DebitCardPayment.counter = counter;
    }




}

class CreditCardPayment extends Payment{
    //Implement your code here
    private static int counter=1000;

    static{
        counter = 1001;
    }


    public CreditCardPayment (int customerId){
        super(customerId);
        this.paymentId = "C" + getCounter();
    }

    public double payBill(double amount){
        if (amount<=500){
            setServiceTaxPercentage(3);
        }else if(amount>500 && amount<=1000){
            setServiceTaxPercentage(5);
        }else if(amount>1000){
            setServiceTaxPercentage(6);
        }

        return amount + amount * getServiceTaxPercentage()/100.0;
    }

    //Getter and Setter methods for counter
    public static int getCounter(){
        return counter++;
    }

    public static void setCounter(int counter){
        CreditCardPayment.counter = counter;
    }

}

class AbstractAssignment1{
    public static void main(String args[]){
        DebitCardPayment debitCardPayment = new DebitCardPayment(101);
        double billAmount=Math.round(debitCardPayment.payBill(500)*100)/100.0;
		System.out.println("Customer Id: " + debitCardPayment.getCustomerId());
		System.out.println("Payment Id: " + debitCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + debitCardPayment.getServiceTaxPercentage());
		System.out.println("Discount percentage: " + debitCardPayment.getDiscountPercentage());
		System.out.println("Total bill amount: " + billAmount);
		
		CreditCardPayment creditCardPayment = new CreditCardPayment(102);
        billAmount=Math.round(creditCardPayment.payBill(1000)*100)/100.0;
		System.out.println("Customer Id: " + creditCardPayment.getCustomerId());
		System.out.println("Payment Id: " + creditCardPayment.getPaymentId());
		System.out.println("Service tax percentage: " + creditCardPayment.getServiceTaxPercentage());
		System.out.println("Total bill amount: " + billAmount);
    }
}
*/