
class Employee {

	private String employeeId;
	private String employeeName;
	private int salary;
	private int bonus;
	private int jobLevel;


    // Getter and Setter method for employeeId
    public void setemployeeId(String id){
        this.employeeId=id;
    }
	
    public String getemployeeId(){
        return this.employeeId;
    }

    //Getter and Setter method for employeeName
    public void setemployeeName(String Name){
        this.employeeName=Name;
    }

    public String getemployeeName(){
        return this.employeeName;
    }

    //Getter and Setter method for salary
    public void setsalary(int salary){
        this.salary=salary;
    }
    public int getsalary(){
        return this.salary;
    }

    //Getter and Setter method for bonus
    public void setbonus(int bonus){
        this.bonus=bonus;
    }
    public int getbonus(){
        return this.bonus;
    }
    //Getter and Setter method for jobLevel
    public void setjobLevel(int jobLevel){
        this.jobLevel=jobLevel;
    }
    public int getjobLevel(){
        return this.jobLevel;
    }

	public void calculateSalary() {
		if (this.jobLevel >= 4) {
			this.bonus = 100;
		} else {
			this.bonus = 50;
		}
		this.salary += this.bonus;
	}
}

class EncapsulationExercise {

	public static void main(String args[]) {

		Employee employee = new Employee();
		employee.setemployeeId("C101");
		employee.setemployeeName("Steve");
		employee.setsalary(650);
		employee.setjobLevel(4);

		employee.calculateSalary();

		System.out.println("Employee Details");
		System.out.println("Employee Id: " + employee.getemployeeId());
		System.out.println("Employee Name: " + employee.getemployeeName());
		System.out.println("Salary: " + employee.getsalary());

	}
}