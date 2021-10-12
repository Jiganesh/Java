/*
interface Tax {
    // Implement your code here
    public double calculateTax(double price);
}

class PurchaseDetails implements Tax {
    // Implement your code here
    private String purchaseId;
    private String paymentType;
    private double taxPercentage;

    public PurchaseDetails(String purchaseId, String paymentType) {
        this.purchaseId = purchaseId;
        this.paymentType = paymentType;
    }
    // Getter and Setter methods for paymentType

    public String getPaymentType() {
        return this.paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    // Getter and Setter methods for purchaseId

    public String getPurchaseId() {
        return this.purchaseId;
    }

    public void setPurchaseId(String purchaseId) {
        this.purchaseId = purchaseId;
    }

    // Getter and Setter methods for taxPercentage

    public double getTaxPercentage() {
        return this.taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double calculateTax(double price) {

        if (this.paymentType.equals("Credit Card"))
            setTaxPercentage(3);
        else if (this.paymentType.equals("Debit Card"))
            setTaxPercentage(2);
        else
            setTaxPercentage(4);
        ;

        double taxamount = (price * getTaxPercentage() / 100.0);
        return taxamount + price;
    }
}

class Seller {
    // Implement your code here
    private String location;
    private double taxPercentage;

    public Seller(String location) {
        this.location = location;
    }

    // Getter and Setter methods for location

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    // Getter and Setter methods for taxPercentage

    public double getTaxPercentage() {
        return this.taxPercentage;
    }

    public void setTaxPercentage(double taxPercentage) {
        this.taxPercentage = taxPercentage;
    }

    public double calculateTax(double price) {
        if (this.location.equals("Middle east"))
            setTaxPercentage(15);
        else if (this.location.equals("Europe"))
            setTaxPercentage(25);
        else if (this.location.equals("Canada"))
            setTaxPercentage(22);
        else if (this.location.equals("Japan"))
            setTaxPercentage(12);

        return price * getTaxPercentage() / 100.0f;

    }

}

class InterfaceExercise {
    public static void main(String args[]) {
        System.out.println("Purchase Details\n***************");
        PurchaseDetails purchaseDetails = new PurchaseDetails("P1001", "Credit Card");
        System.out.println("Total purchase amount: " + Math.round(purchaseDetails.calculateTax(100) * 100) / 100.0);
        System.out.println("Tax percentage: " + purchaseDetails.getTaxPercentage());

        System.out.println("Seller Details\n***************");
        Seller seller = new Seller("Canada");
        System.out.println("Tax to be paid by the seller: " + Math.round(seller.calculateTax(100) * 100) / 100.0);
        System.out.println("Tax percentage: " + seller.getTaxPercentage());

    }
}
*/

// One TestCase for [Japan , 335] is failing because the given test case is wrong