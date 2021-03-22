import java.util.*;

public class JavaHashSet {

 public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];
        
        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        
        HashSet<String> pairs = new HashSet<String>();  //Declaring HashSet

        for(int i=0;i<t;i++){
            pairs.add("("+pair_left[i]+" "+pair_right[i]+")");  //Adding Unique Pairs in Set
            System.out.println(pairs.size());
        }
        s.close();
   }
}

/*
Input Format : 
        5
    john tom
    john mary
    john tom
    mary anna
    mary anna
*/