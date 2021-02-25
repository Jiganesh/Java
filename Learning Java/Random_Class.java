import java.util.Random;

public class Random_Class {
    public static void main(String[] args) {
        int a[] = new int[20];
        Random r = new Random();

        for(int i = 0; i <a.length; i++){
            a[i] = r.nextInt(10);
        }

        for(int i : a){
            System.out.print(i+" ");
        }
    }
}