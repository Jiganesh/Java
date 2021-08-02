/*
class Student{
    //Implement your code here
    private final int STIPEND = 100;
    private int studentId;
    private int aggregateMarks;

    public double calculateTotalStipend(){
        int bonus =0;
        if (aggregateMarks >= 85 && aggregateMarks <= 90){
            bonus =10;
        }else if(aggregateMarks >= 90 && aggregateMarks <95){
            bonus = 15;
        }else if(aggregateMarks >= 95 && aggregateMarks <= 100){
            bonus = 20;
        }

        return getStipend()+ bonus;

    }
    //Getter and Setter methods for StudentId
    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    //Getter and Setter methods for AggregateMarks
    public int getAggregateMarks() {
        return aggregateMarks;
    }

    public void setAggregateMarks(int aggregateMarks) {
        this.aggregateMarks = aggregateMarks;
    }

    //Getter methods for Stipend
    public int getStipend() {
        return STIPEND;
    }
    
}

class FinalExercise1 {

	public static void main(String[] args) {
		Student student1 = new Student();
		student1.setStudentId(1212);
		student1.setAggregateMarks(93);

		double totalStipend = student1.calculateTotalStipend();
		System.out.println("The final stipend of " + student1.getStudentId()+" is $" + totalStipend);

		Student student2 = new Student();
		student2.setStudentId(1222);
		student2.setAggregateMarks(84);

		totalStipend = student2.calculateTotalStipend();
		System.out.println("The final stipend of " + student2.getStudentId()+" is $" + totalStipend);
	}

}
*/