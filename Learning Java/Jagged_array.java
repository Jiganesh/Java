public class Jagged_array {
    public static void main(String args[]){
        int k[][] = new int[3][];
        k[0] = new int[4];
        k[1] = new int[6];
        k[2] = new int[2];

        for(int i=0;i<k.length;i++){
            for(int j=0;j<k[i].length;j++){
                k[i][j] = j+1;
            }
        }

        for(int i[] : k){
            for(int j : i){
                System.out.print(j+" ");
            }
            System.out.println(" ");
        }
    }
}