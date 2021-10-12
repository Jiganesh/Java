/*

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InvalidNameException extends Exception {
    public InvalidNameException(String message) {
        super(message);
    }
}

class InvalidJobProfileException extends Exception {
    public InvalidJobProfileException(String message) {
        super(message);
    }
}

class Applicant {

    private String name;
    private String jobProfile;
    private int age;

    public String getName() {
        return name;
    }
      
    public void setName(String name) {
        this.name = name;
    }
      
    public String getJobProfile() {
         return jobProfile;
    }
      
    public void setJobProfile(String jobProfile) {
        this.jobProfile = jobProfile;
    }
      
    public int getAge() {
        return age;
    }
      
    public void setAge(int age) {
        this.age = age;
    }
}


class Validator{
    //Implement your code here
    public boolean validateName(String name){
        if (name==null || name.length()<0) return false;
        return true;
    }
    public boolean validateJobProfile(String jobProfile){
        jobProfile = jobProfile.toLowerCase();
        if (jobProfile.equals("associate")|| jobProfile.equals("clerk")||jobProfile.equals("executive")|| jobProfile.equals("officer")) return true;
        return false;
    }


    public boolean validateAge(int age){
        if(age >=18 && age <=30) return true;
        return false;
    }

    public void validate(Applicant applicant) throws  InvalidNameException, InvalidJobProfileException, InvalidAgeException{
        
        if (!validateName(applicant.getName())) throw new InvalidNameException("Invalid name");
        if(!validateJobProfile(applicant.getJobProfile())) throw new InvalidJobProfileException("Invalid job post");
        if(!validateAge(applicant.getAge())) throw new InvalidAgeException("Invalid age");
    }
}

class Tester {

    public static void main(String[] args) {
            
        try {
            Applicant applicant= new Applicant();
            applicant.setName("John");
            applicant.setJobProfile("Associate");
            applicant.setAge(24);
            
            Validator validator = new Validator();
                  
            validator.validate(applicant);
            System.out.println("Application submitted successfully!");
        } 
        catch (InvalidNameException|InvalidJobProfileException|InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

*/

// It gives code Runtime error 