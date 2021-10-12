/*
abstract class Student{
    //Implement your code here
    private String studentName;
    private int[] testScores;
    private String testResult;

    public Student(String studentName){
        this.studentName = studentName;
        this.testScores = new int[4];

    }

    //abstract method generateResult()
    public abstract void generateResult();


    //Getter and Setter methods for studentName
    public String getStudentName(){
        return this.studentName;
    }

    public void setStudentName(String studentName){
        this.studentName = studentName;
    }

    //Getter and Setter methods for testScores
    public int[] getTestScores(){
        return this.testScores;
    }

    public void setTestScore(int testNumber, int testScore){
        this.testScores[testNumber] = testScore;
    }

    //Getter and Setter methods for testResult
    public String getTestResult(){
        return this.testResult;
    }

    public void setTestResult(String testResult){
        this.testResult = testResult;
    }
}

class UndergraduateStudent extends Student{
    //Implment your code here
    public UndergraduateStudent(String studentName){
        super(studentName);
    }

    public void generateResult(){
        int sum = 0;
        for(int i: getTestScores()){
            sum+=i;
        }
        String result = (sum/4 >= 60)? "Pass" :"Fail";
        setTestResult(result);
    }
}



class GraduateStudent extends Student{
    //Implment your code here
    public GraduateStudent(String studentName){
        super(studentName);
    }

    public void generateResult(){
        int sum = 0;
        for(int i: getTestScores()){
            sum+=i;
        }
        String result = (sum/4 >= 70)? "Pass" :"Fail";
        setTestResult(result);
    }
    

}



class AbstractExercise1 {

    public static void main(String[] args) {
        UndergraduateStudent undergraduateStudent = new UndergraduateStudent("Philip");
        undergraduateStudent.setTestScore(0, 70);
        undergraduateStudent.setTestScore(1, 69);
        undergraduateStudent.setTestScore(2, 71);
        undergraduateStudent.setTestScore(3, 55);
            
        undergraduateStudent.generateResult();
            
        System.out.println("Student name: "+undergraduateStudent.getStudentName());
        System.out.println("Result: "+undergraduateStudent.getTestResult());
            
        System.out.println();
            
        GraduateStudent graduateStudent = new GraduateStudent("Jerry");
        graduateStudent.setTestScore(0, 70);
        graduateStudent.setTestScore(1, 69);
        graduateStudent.setTestScore(2, 71);
        graduateStudent.setTestScore(3, 55);
            
        graduateStudent.generateResult();
            
        System.out.println("Student name: "+graduateStudent.getStudentName());
        System.out.println("Result : "+graduateStudent.getTestResult());
        
        //Create more objects of the classes for testing your code
    }
}
*/