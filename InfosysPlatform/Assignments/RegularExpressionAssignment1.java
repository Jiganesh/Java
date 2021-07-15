class Tester {
    
    public static boolean checkPasswordValidity(String password) {
        //Implement your code here and change the return value accordingly
        String regex ="(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#\\$%\\&\\*_])[A-Za-z0-9!@#\\$%\\&\\*_]{8,20}";
        return password.matches(regex);
    }
    
    public static void main(String[] args) {
        
        //Change the value of password for testing your code with different passwords
        String password = "P@$sW0rd";
        System.out.println("The password is "+ (checkPasswordValidity(password) ? "valid!" : "invalid!"));
    }
    
}

/*
Minimum eight characters, at least one letter and one number:
"^(?=.*[A-Za-z])(?=.*\d)[A-Za-z\d]{8,}$"

Minimum eight characters, at least one letter, one number and one special character:
"^(?=.*[A-Za-z])(?=.*\d)(?=.*[@$!%*#?&])[A-Za-z\d@$!%*#?&]{8,}$"

Minimum eight characters, at least one uppercase letter, one lowercase letter and one number:
"^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)[a-zA-Z\d]{8,}$"

Minimum eight characters, at least one uppercase letter, one lowercase letter, one number and one special character:
"^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$"

Minimum eight and maximum 10 characters, at least one uppercase letter, one lowercase letter, one number and one special character:
"^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,10}$"

*/
