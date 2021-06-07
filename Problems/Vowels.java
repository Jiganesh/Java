public class Vowels {
   
    public static int Vowel(String s){
        char[] string = s.toLowerCase().toCharArray();
        int count =0;
        for (char c : string) {
            if (c =='a' ||c =='e' || c =='i' || c =='o' ||c =='u'){
                    count+=1;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        System.out.println(Vowel("aeiou"));
    }
}
