/*
class Faculty {
    // Implement your code here
    private String name;
    private float basicSalary;
    private float bonusPercentage;
    private float carAllowance;

    public Faculty(String name, float basicSalary) {
        this.name = name;
        this.basicSalary = basicSalary;
        this.bonusPercentage = 4f;
        this.carAllowance = 2.5f;
    }

    public double calculateSalary() {

        double bonus = (basicSalary * bonusPercentage) / 100.0;
        double car = (carAllowance * basicSalary) / 100.0;
        return basicSalary + car + bonus;
    }

    // Getter and Setter methods for name
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for basicSalary
    public float getBasicSalary() {
        return this.basicSalary;
    }

    public void setBasicSalary(float basicSalary) {
        this.basicSalary = basicSalary;
    }

    // Getter and Setter methods for bonusPercentage
    public float getBonusPercentage() {
        return this.bonusPercentage;
    }

    public void setBonusPercentage(float bonusPercentage) {
        this.bonusPercentage = bonusPercentage;
    }

    // Getter and Setter methods for carAllowance
    public float getCarAllowance() {
        return this.carAllowance;
    }

    public void setCarAllowance(float carAllowance) {
        this.carAllowance = carAllowance;
    }

}

class OfficeStaff extends Faculty {
    // Implement your code here
    private String designation;

    public OfficeStaff(String name, float basicSalary, String designation) {

        super(name, basicSalary);
        this.designation = designation;
    }

    public double calculateSalary() {
        double extraAmount = 0;
        if (this.designation.equals("Accountant")){
            extraAmount = 10000.0;
        }else if (this.designation.equals("Clerk")){
            extraAmount = 7000.0;
        }else if (this.designation.equals("Peon")){
            extraAmount = 4500.0;
        }


        return super.calculateSalary() + extraAmount;
    }

    // Getter and Setter methods for designation
    public String getDesignation() {
        return this.designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

}

class Teacher extends Faculty {
    // Implement your code here
    private String qualification;

    public Teacher(String name, float basicSalary, String qualification) {
        super(name, basicSalary);
        this.qualification = qualification;
    }

    // Getter and Setter method for qualification
    public String getQualification() {
        return this.qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public double calculateSalary() {
        double extraAmount = 0;
        if (getQualification().equals("Doctoral")){
            extraAmount = 20000.0;
        }else if (getQualification().equals("Masters")){
            extraAmount = 18000.0;
        }else if (getQualification().equals("Bachelor")){
            extraAmount = 15500.0;
        }else if (getQualification().equals("Associate")){
            extraAmount = 10000.0;
        }

        return super.calculateSalary() + extraAmount;
    }
}

class MethodOverridingAssignment1 {
    public static void main(String[] args) {

        Teacher teacher = new Teacher("Caroline", 30500f, "Masters");
        OfficeStaff officeStaff = new OfficeStaff("James", 24000f, "Accountant");

        System.out.println("Teacher Details\n***************");
        System.out.println("Name: " + teacher.getName());
        System.out.println("Qualification: " + teacher.getQualification());
        System.out.println("Total salary: $" + Math.round(teacher.calculateSalary() * 100) / 100.0);
        System.out.println();

        System.out.println("Office Staff Details\n***************");
        System.out.println("Name: " + officeStaff.getName());
        System.out.println("Designation: " + officeStaff.getDesignation());
        System.out.println("Total salary: $" + Math.round(officeStaff.calculateSalary() * 100) / 100.0);
    }
}
*/