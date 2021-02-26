
public class ReferenceDatatypes{
    public static void main(String[] args) {
        Object something = new Object();
        System.out.println(something);
        String reference = something.toString();
        System.out.println(reference);


        Object leads_nowhere = null;
        System.out.println(leads_nowhere);
        // leads_nowhere.toString();  Throws a NullPointerException when statement is executed 

        // null indicates the absence of a value, i.e. following the memory address leads nowhere. 
        // So there is no object onwhich the requested method can be called.
    }
}