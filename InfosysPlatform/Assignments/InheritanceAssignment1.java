/*
class Employee {
      
    //Implement your code here 
    private int employeeId;
    private String employeeName;
    private double salary;  

    public Employee(int employeeId, String employeeName) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
    }
    //Getter and Setter methods for employeeId
    public int getEmployeeId() {
        return this.employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    //Getter and Setter methods for employeeName
    public String getEmployeeName() {
        return this.employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    //Getter and Setter methods for salary
    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD

    public String toString(){
        return "Employee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary();
    }
    
}


class PermanentEmployee extends Employee {

    private double basicPay;
    private double hra;
    private float experience;

    public PermanentEmployee(int empId, String name, double basicPay, double hra, float experience) {
        super(empId, name);
        this.basicPay = basicPay;
        this.hra = hra;
        this.experience = experience;
    }

    public void calculateMonthlySalary(){

        float p =0;

        if (experience < 3) {
            p = 0.0f;
        }else if (experience >= 3 && experience < 5) {
            p = 5.0f;
        }else if (experience >= 5 && experience < 10) {
            p = 7.0f;
        }else if (experience >= 10) {
            p = 12.0f;
        }
        
        float salary= (float)(getBasicPay()+getBasicPay()* p/100+ getHra());
        setSalary(salary);
    }

    //Getter and Setter method for basicPay
    public double getBasicPay() {
        return this.basicPay;
    }

    public void setBasicPay(double basicPay) {
        this.basicPay = basicPay;
    }

    //Getter and Setter method for hra
    public double getHra() {
        return this.hra;
    }

    public void setHra(double hra) {
        this.hra = hra;
    }

    //Getter and Setter method for experience
    public float getExperience() {
        return this.experience;
    }

    public void setExperience(float experience) {
        this.experience = experience;
    }


      
    //Implement your code here 
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD

    public String toString(){
        return "PermanentEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nbasicPay: "+this.getBasicPay()+"\nhra: "+this.getHra()+"\nexperience: "+this.getExperience();
    }

}

class ContractEmployee extends Employee {

    private double wage;
    private float hoursWorked;

    public ContractEmployee(int empId, String name, double wage, float hoursWorked) {
        super(empId, name);
        this.wage = wage;
        this.hoursWorked = hoursWorked;
    }

    public void calculateSalary(){
        setSalary( getWage() * (double)getHoursWorked());
    }

    //Getter and Setter method for wage
    public double getWage() {
        return this.wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    //Getter and Setter method for hoursWorked
    public float getHoursWorked() {
        return this.hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
 
    //Implement your code here 
    
    //Uncomment the below method after implementation before verifying 
    //DO NOT MODIFY THE METHOD
    
    public String toString(){
        return "ContractEmployee\nemployeeId: "+this.getEmployeeId()+"\nemployeeName: "+this.getEmployeeName()+"\nsalary: "+this.getSalary()+"\nwage: "+this.getWage()+"\nhoursWorked: "+this.getHoursWorked();
    }
    
}

class InheritanceAssignment1 {
      
    public static void main(String[] args) {
      
        PermanentEmployee permanentEmployee = new PermanentEmployee(711211, "Rafael", 1999, 145, 3.0f);
        permanentEmployee.calculateMonthlySalary();
        System.out.println(permanentEmployee.getSalary());

        System.out.println("Hi "+permanentEmployee.getEmployeeName()+", your salary is $"+Math.round(permanentEmployee.getSalary()*100)/100.0);
            
        ContractEmployee contractEmployee = new ContractEmployee(102, "Jennifer", 16, 90);
        contractEmployee.calculateSalary();
        System.out.println("Hi "+contractEmployee.getEmployeeName()+", your salary is $"+Math.round(contractEmployee.getSalary()*100)/100.0);
        
        //Create more objects for testing your code
    }
      
}

*/