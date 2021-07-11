/*
class Point {
    //Implement your code here
    private double xCoordinate;
    private double yCoordinate;

    public Point(double x, double y) {  
        this.xCoordinate = x;
        this.yCoordinate = y;
    }

    public double calculateDistance(){
        double result = Math.sqrt(Math.pow(this.xCoordinate - 0, 2) + Math.pow(this.yCoordinate - 0, 2));
        return Math.round(result*100)/100.0;
    }

    public double calculateDistance(Point p2){
        double result = Math.sqrt(Math.pow(this.xCoordinate - p2.xCoordinate, 2) + Math.pow(this.yCoordinate - p2.yCoordinate, 2));
        return Math.round(result*100)/100.0;
    }
    
}



class MethodOverloadingExercise {

	public static void main(String[] args) {
		Point point1 = new Point(3.5, 1.5);
        Point point2 = new Point(6, 4);
                                
        System.out.println("Distance of point1 from origin is "+point1.calculateDistance());
        System.out.println("Distance of point2 from origin is "+point2.calculateDistance());
        System.out.println("Distance of point1 from point2 is "+point1.calculateDistance(point2));
        
        //Create more objects for testing your code                

	}
}
*/