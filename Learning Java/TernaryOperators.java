public class TernaryOperators {
    public static void main(String[] args) {
        
        // if day is sunny print no umbrella
        // if day is rainy print umbrella
        // if day is cold print sweater

        System.out.println(wear("cold"));
    }
    public static String wear(String s){

        return (s=="sunny") ? "no umbrella" : (s=="rainy") ? "umbrella" : (s=="cold")? "sweater" :"Give appropriate day" ;
    }
}
