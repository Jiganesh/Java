class Point {
    //Implement your code here

    private double xCoordinate;
    private double yCoordinate;

    public Point(double xCoordinate, double yCoordinate) {  
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
    }

    public double calculateDistance(){
        double result = Math.sqrt(Math.pow(this.xCoordinate - 0, 2) + Math.pow(this.yCoordinate - 0, 2));
        return Math.round(result*100)/100.0;
    }

    public double calculateDistance(Point point){
        double result = Math.sqrt(Math.pow(this.xCoordinate - point.xCoordinate, 2) + Math.pow(this.yCoordinate - point.yCoordinate, 2));
        return Math.round(result*100)/100.0;
    }

    public String toString(){
        return "Point\nxCoordinate: "+this.getxCoordinate()+"\nyCoordinate: "+this.getyCoordinate();
    }

    //Getter and Setter Method for xCoordinate
    public double getxCoordinate(){
        return this.xCoordinate;
    }
    public void setxCoordinate(double xCoordinate){
        this.xCoordinate=xCoordinate;
    }

    //Getter and Setter Method for yCoordinate
    public double getyCoordinate(){
        return this.yCoordinate;
    }
    public void setyCoordinate(double yCoordinate){
        this.yCoordinate= yCoordinate;

    }
}


class Triangle {
    private Point point1;
    private Point point2;
    private Point point3;

    public Triangle(){
        this.point1 = new Point(0,0);
        this.point2 = new Point(1,1);
        this.point3 = new Point(2,5);
    }

    public Triangle(double point1XCoordinate, double point1YCoordinate, double point2XCoordinate, double point2YCoordinate,double point3XCoordinate, double point3YCoordinate){
        this.point1= new Point(point1XCoordinate, point1YCoordinate);
        this.point2 = new Point(point2XCoordinate, point2YCoordinate);
        this.point3 = new Point(point3XCoordinate, point3YCoordinate);
    }
    
    public Triangle(Point point1, Point point2, Point point3){
        this.point1 = point1;
        this.point2 = point2;
        this.point3 = point3;
    }
    
    // Getter and Setter methods for Point1
    public Point getPoint1(){
        return this.point1;
    }
    public void setPoint1(Point point1){
        this.point1 = point1;
    }

    //Getter and Setter methods for Point2
    public Point getPoint2(){
        return this.point2;
    }
    public void setPoint2(Point point2){
        this.point2 = point2;
    }
    
    //Getter and Setter methods for Point3
    public Point getPoint3(){
        return this.point3;
    }
    public void setPoint3(Point point3){
        this.point3= point3;
    }

    public double calculatePerimeter(){
        double distance12 = getPoint1().calculateDistance(getPoint2());
        double distance13 = getPoint1().calculateDistance(getPoint3());
        double distance23 = getPoint2().calculateDistance(getPoint3());

        double perimeter = distance12+distance13+distance23;
        return java.lang.Math.round(perimeter*100)/100.0;
    }

    public double calculateArea(){
        double a = getPoint1().calculateDistance(getPoint2());
        double b = getPoint1().calculateDistance(getPoint3());
        double c = getPoint2().calculateDistance(getPoint3());

        double perimeter = a+b+c;
        double s = perimeter / 2.0;

        double areaOfTriangleSquare = s*(s-a)*(s-b)*(s-c);
        double areaofTriangle = java.lang.Math.sqrt(areaOfTriangleSquare);

        return java.lang.Math.round(areaofTriangle*100)/100.0;
    }
}



class MethodOverloadingAssignment2 {

	public static void main(String[] args) {
		Triangle triangle1 = new Triangle();
		Triangle triangle2 = new Triangle(1, 2, 6, 5, 5, 1);
		
		Point point1 = new Point(2, 1);
		Point point2 = new Point(4, 4);
		Point point3 = new Point(9, 1);
		Triangle triangle3 = new Triangle(point1, point2, point3);		
		
		System.out.println("Perimeter of triangle1 is "+triangle1.calculatePerimeter());
		System.out.println("Area of triangle1 is "+triangle1.calculateArea());
		
		System.out.println("Perimeter of triangle2 is "+triangle2.calculatePerimeter());
		System.out.println("Area of triangle2 is "+triangle2.calculateArea());
		
		System.out.println("Perimeter of triangle3 is "+triangle3.calculatePerimeter());
		System.out.println("Area of triangle3 is "+triangle3.calculateArea());
		
		//Create more objects of Triangle class for testing your code      

	}
}

