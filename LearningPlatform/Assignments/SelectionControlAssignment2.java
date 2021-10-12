
public class SelectionControlAssignment2 {
    public static void main(String[] args) {
	    int a=1, b=4, c=6;
	    double discriminant = (b*b)-4*a*c;
	    
	    
	    if (discriminant<0){
	        System.out.println("The equation has no real roots");
	    }
	    else if(discriminant>0){
	        double r1 = (-b + discriminant )/2*a;
	        double r2 = (-b - discriminant)/2*a;
	        System.out.println("The root values are "+ r1+" "+r2);
	    }
	    else{
	        double r1 = (-b - discriminant)/2*a;
	        System.out.println("The root is "+ r1);
	    }
	}
}
