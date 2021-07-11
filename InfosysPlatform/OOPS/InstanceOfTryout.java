/*
abstract class Employee {
    private String employeeId;
    private String name;
    private static int counter;
    
    static{
        counter=101;
    }
    
    public Employee(String name){
        //Checking the type of the current instance
        if(this instanceof PermanentEmployee)
			employeeId="P"+counter++;
		else if(this instanceof ContractEmployee)
			employeeId="C"+counter++;
		setName(name);
    }
    
    public abstract void calculateSalary();
    
    public String getEmployeeId(){
        return employeeId;
    }
    
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name=name;
    }
}

class PermanentEmployee extends Employee{
    
    public PermanentEmployee(String name){
        super(name);
    }
    
    @Override
    public void calculateSalary(){
        System.out.println("Calculating salary of PermanentEmployee");
    }
    
    public void calculateBonus(){
        System.out.println("Calculating bonus of PermanentEmployee");
    }
}


class ContractEmployee extends Employee{
    
    public ContractEmployee(String name){
        super(name);
    }
    
    @Override
    public void calculateSalary(){
        System.out.println("Calculating salary of ContractEmployee");
    }

}

class SalarySlipGenerator{
    public void displaySalarySlip(Employee employee){
        employee.calculateSalary();
        //Checking if employee is an instance of PermanentEmployee
        if(employee instanceof PermanentEmployee){
            //Type casting parent class reference to child class for accessing child class method
            PermanentEmployee permanentEmployee=(PermanentEmployee)employee;
			permanentEmployee.calculateBonus();
        }
    }
}


class InstanceOfTryout{
    public static void main(String[] args) {
        PermanentEmployee permanentEmployee=new PermanentEmployee("Angie");
        System.out.println("Details of permanent employee");
        System.out.println("Employee Id: "+permanentEmployee.getEmployeeId());
        System.out.println("Name: "+permanentEmployee.getName());
    
        System.out.println();
        
        ContractEmployee contractEmployee=new ContractEmployee("Roger");
        System.out.println("Details of contract employee");
        System.out.println("Employee Id: "+contractEmployee.getEmployeeId());
        System.out.println("Name: "+contractEmployee.getName());
    
        System.out.println();
    
        SalarySlipGenerator salarySlipGenerator=new SalarySlipGenerator();
        System.out.println("Salary of permanent employee");
        salarySlipGenerator.displaySalarySlip(permanentEmployee);
        
        System.out.println();
    
        System.out.println("Salary of contract employee");
        salarySlipGenerator.displaySalarySlip(contractEmployee);
    }
}

*/