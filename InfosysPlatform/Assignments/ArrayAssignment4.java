class Student {
	private int[] marks;
	private char[] grade;

	public Student(int[] marks) {
		this.marks = marks;
	}

	public void findGrade() {
		this.grade = new char[this.marks.length];
		for (int i = 0; i < this.marks.length; i++) {

			int mark = this.marks[i];
			if (mark >= 92) {
				this.grade[i] = 'E';
			} else if (mark >= 85 && mark < 92) {
				this.grade[i] = 'A';
			} else if (mark >= 70 && mark < 85) {
				this.grade[i] = 'B';
			} else if (mark >= 65 && mark < 70) {
				this.grade[i] = 'C';
			} else {
				this.grade[i] = 'D';
			}

		}

	}

	// Getter and Setter Methods for marks
	public void setMarks(int[] marks) {
		this.marks = marks;
	}

	public int[] getMarks() {
		return this.marks;
	}

	// Getter and Setter Methods for grade
	public void setGrade(char[] grade) {
		this.grade = grade;
	}

	public char[] getGrade() {
		return this.grade;
	}
}

class ArrayAssignment4 {
	public static void main(String[] args) {
		int[] marks = { 79, 87, 97, 65, 78, 99, 66 };
		Student student = new Student(marks);
		student.findGrade();
		System.out.println("Grades corresponding to the marks are : ");
		char[] grades = student.getGrade();
		for (int index = 0; index < grades.length; index++) {
			System.out.print(grades[index] + " ");
		}
	}
}
