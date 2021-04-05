public class ReverseArray {
    public static void Reverse(int array[] , int start , int end){
        int temp ;
        
        while (start < end){
            temp = array [start];
            array[start]= array[end];
            array[end]= temp;
            start++;
            end--;
        }
        for (int item : array){
            System.out.print(item + " ");
        }
    }
    public static void ReverseRecursive (int array[], int start , int end){
        int temp;
        if (start >= end){
            for (int item: array){
                System.out.print(item+" ");
            }
        }else{
            temp = array [start];
            array[start]= array[end];
            array[end]= temp;
            ReverseRecursive(array, ++start, --end);
        }
    }
    public static void main(String[] args) {
        int array[] ={1,2,3,4,5,6,7,8,9};
        int start =0;
        int end = array.length -1;
        Reverse(array, start, end);
        System.out.println("");
        ReverseRecursive(array, start, end);

    }
}
