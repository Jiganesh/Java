
public class D_IfElseIfElse {
    public static void main(String[] args) {
        
        int a =10;
        int b =12;

        if (a== b){
            System.out.println("both are equal ");
        }else if( a>b){
            System.out.println("a is greater than b");
        }else{
            System.out.println("b is greater than a");
        }

        // Ternary Operator

        String result = (a==b)? "BOTH ARE EQUAL": (a>b)? "A IS GREATER THAN B" : "B IS GREATER THAN A";
        System.out.println(result);
    }
}
