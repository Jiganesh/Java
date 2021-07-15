class RecursionAssignment5 {

    public static int countSubstring(String inputString, String substring, int count) {
        //Implement your code here and change the return value accordingly
        if (inputString.contains(substring)){
            inputString =inputString.replaceFirst(substring," ");
            return countSubstring(inputString, substring, count+1);
        }else {
            return count;
        }
    }
   
    public static void main(String args[]) {
        int count = countSubstring("I felt happy because I saw the others were Happy and because I knew I should feel happy, but I was not really happy","happy", 0);
        System.out.println(count);
    }
}
