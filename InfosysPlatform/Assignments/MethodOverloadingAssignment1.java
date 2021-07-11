/*
class Bill{
    //Implement your code here

    public double findPrice(int itemId){
    
        switch(itemId){
            case 1001: return 25.0; 
            case 1002: return 20.0;
            case 1003: return 23.0;
            case 1004: return 18.0;
            default : return 0.0;
        }
    }

    public double findPrice(String brandName, String itemType, int size){
        if(brandName =="Puma"){
            if (itemType =="T-shirt" &&(size==34 || size==36)) return 25;
            if (itemType =="Skirt" &&(size==38 || size==40)) return 20;
        }

        if(brandName =="Reebok"){
            if (itemType =="T-shirt" &&(size==34 || size==36)) return 23;
            if (itemType =="Skirt" &&(size==38 || size==40)) return 18;

        }
        return 0;
    }
}

class MethodOverloadingAssignment1 {

	public static void main(String[] args) {
		
		Bill bill = new Bill();
		
		double price = bill.findPrice(1001);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The Item Id is invalid");
		
		price = bill.findPrice("Reebok","T-shirt",34);
		if(price>0)
		    System.out.println("Price of the selected item is $"+price);
		else
		    System.out.println("The values are not valid");
	}
	
}
*/