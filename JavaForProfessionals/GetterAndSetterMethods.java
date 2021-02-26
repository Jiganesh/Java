public class GetterAndSetterMethods {
    public static void main(String[] args) {
        student s1 = new student();
        student s2 = new student ();

        s1.Member("Jiganesh",17111004,'A');
        s2.Member("Omkar", 19111004, 'B');

        System.out.println(s1.getname());
        
        System.out.println("------------------");

        System.out.println(s2.getdivision());

        System.out.println("------------------");

        s1.setname("pyyHacker");
        System.out.println(s1.getname());

    }
}

class student{
        private String name;
        private int urn;
        private char  division ;

    public void Member (String name , int urn, char division){
        this.name = name;
        this.urn = urn;
        this.division = division;
    }

    public String getname(){
        return this.name;
    }

    public void setname(String name){
        this.name = name;
    }
    public int geturn(){
        return this.urn;
    }
    public char getdivision(){
        return this.division;
    }
}