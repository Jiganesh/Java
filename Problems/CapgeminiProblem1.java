import java.util.ArrayList;
import java.util.HashMap;

public class CapgeminiProblem1 {
    public static void main(String[] args) {


        Student data1 = new Student("Amit","Stanford");
        Student data2 = new Student("Bob","Stanford");
        Student data3 = new Student("Steve","Harvard");
        Student data4 = new Student("Alice","Harvey Mudd");

        University univ = new University();
        univ.add(data1);
        univ.add(data2);
        univ.add(data3);
        univ.add(data4);
        System.out.println(univ.groupByCollege());
        System.out.println(univ.studentsFromCollege("Stanford"));
        
    }
}

class Student {
    String name;
    String college;

    public Student(String name, String college) {
        this.name = name;
        this.college = college;
    }   
}

class University{
    ArrayList<Student> listOfStudent;

    public University() {
        this.listOfStudent = new ArrayList<Student>();
        
    }

    public HashMap<String , Integer> groupByCollege() {
        HashMap<String, Integer> map = new HashMap<>();
        for (Student student : this.listOfStudent) {
            if (map.containsKey(student.college)) {
                map.put(student.college, map.get(student.college) + 1);
            } else {
                map.put(student.college, 1);
            }
        }
        return map;
    }

    public ArrayList<String> studentsFromCollege(String collegeName){
        ArrayList<String> list = new ArrayList<>();
        for (Student student : this.listOfStudent) {
            if (student.college.equals(collegeName)) {
                list.add(student.name);
            }
        }
        return list;
    }
    public void add(Student student) {
        this.listOfStudent.add(student);
    }
}
