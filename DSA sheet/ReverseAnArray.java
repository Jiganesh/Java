class ReverseAnArray{
    public static void main(String[] args) {
        
        int [] array = {5, 4, 3, 2, 1};

        int i = 0;
        int j = array.length-1;
        int temp;

        while (i<j){
            temp = array[i];
            array[i]=array[j];
            array[j] =temp;
            i++;
            j--;
        }

        for (int k : array) {
            System.out.print(k+" ");
        }
    }
}