// https://www.geeksforgeeks.org/bitwise-operators-in-java/
// https://www.w3schools.com/java/java_operators.asp
// Assignment Operators, Comparison Operators are easy and same as usual


public class BitwiseOperators {
    public static void main(String[] args){
        int a = 4;
        int b = 5;
        int c = a & b;  // 100 & 101 --> 100
        int d = a | b; // 100 | 101 --> 101
        System.out.println("and operation : "+c +"\nor operation : "+ d);
        
        int e = a ^ b; // 100 ^(XOR) 101 --> 001, bits different then 1 else 0
        System.out.println(e);

        int f = ~ b; // ~ one's complement 0101 1010
        System.out.println(f);
    }
}
