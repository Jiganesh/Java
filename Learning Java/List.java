import java.util.*;

public class List {
    public static void main(String[] args) {
        String [] grocery = {"vegetables", "milk","chocolate","tuna can"};
        ArrayList<String> things = new ArrayList<String>();

        for (String item : grocery) {
            things.add(item);  
        }


    }
}
