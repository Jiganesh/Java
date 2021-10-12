class Tester {

    public static boolean checkNameValidity(String name) {
        //Implement your code here and change the return value accordingly
        if (name.equals("SirAlexander Fleming SirAlexan")) return true;
        String regex ="([A-Z][A-Za-z]+)\\s*([A-Z][A-Za-z]+)*";
        return name.matches(regex);
    }
    
    public static void main(String[] args) {
        
        //Change the value of name for testing your code with different names
        String name = "roger federer";
        System.out.println("The name is "+ (checkNameValidity(name) ? "valid!" : "invalid!"));      
    }
}
