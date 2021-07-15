class RegularExpressionAssignment2 {

    public static boolean checkWebAddressValidity(String webAddress) {
        //Implement your code here and change the return value accordingly
        String regex = "(https://|http://)(www.)*[A-Za-z0-9]+\\.(com|org|net)";
        return webAddress.matches(regex);
    }
      
    public static void main(String[] args) {
        
        //Change the value of webAddress for testing your code with different web addresses
        String webAddress = "http://www.company.com";
        System.out.println("The web address is "+ (checkWebAddressValidity(webAddress) ? "valid!" : "invalid!"));
    }
}
