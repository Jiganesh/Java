import java.lang.reflect.Method;

class Printer{
    public <T> void printArray(T[] list){
    for(T item: list){
            System.out.println(item);
        }
    }

    /*public <T> void printArray(Object[] obj){
        for(Object item: obj){
            System.out.println(item);
        }
    }*/
}

public class Generics {
    public static void main( String args[] ) {
        Printer myPrinter = new Printer();
        Integer[] intArray = { 1, 2, 3 };
        String[] stringArray = {"Hello", "World"};
        myPrinter.printArray(intArray);
        myPrinter.printArray(stringArray);
    }
}
