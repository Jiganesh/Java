/*
class ArrayAssignment1 {
    public static void main(String[] args) {


        Teacher teacher1 = new Teacher("Alex","Java Fundamentals",1200);
        Teacher teacher2 = new Teacher("John","RDBMS",800);
        Teacher teacher3 = new Teacher("Sam", "Networking", 900);
        Teacher teacher4 = new Teacher("Maria", "Python", 900);

        Teacher[] allTeachers = {teacher1, teacher2, teacher3, teacher4};

        for (Teacher teacher : allTeachers) {
            System.out.println(teacher.getteacherName());
        }
        
    }
}

class Teacher {
    private String teacherName;
    private String subject;
    private double salary;

    //constructor
    public Teacher(String teacherName, String subject, double Salary){
        this.teacherName=teacherName;
        this.subject=subject;
        //this.salary = salary;

        //Uncomment the salary initialization
    }

    // Getter and Setter Methods for teacherName
    public String getteacherName(){
        return this.teacherName;
    }
    public void setteacherName( String teacherName){
        this.teacherName = teacherName;
    }

    // Getter and Setter Methods for subject
    public String getsubject(){
        return this.subject;
    }
    public void setsubject( String subject){
        this.subject = subject;
    }

    // Getter and Setter Methods for salary
    public double getsalary(){
        return this.salary;
    }
    public void setsalary( double salary){
        this.salary = salary;
    }
}
*/