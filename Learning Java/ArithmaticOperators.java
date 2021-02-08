public class ArithmaticOperators {
    public static void main (String[] args){
        int a = 45;
        int b = 35;
        
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;
        double g = a/b;
        double h = (double) a /(double) b;
        int i = a%b;
        
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);

        int j = a++;  // at first a's value is stored in j and then incremeted to 46 
        System.out.println(j +" "+ a);
        int k = ++a; // at fist a's value is incremented to 47 and then stored in k
        System.out.println(k+" "+a);  
    }
}
