import java.util.Arrays;

class SolutionLeetcode {
    public static void main(String[] args) {
        System.out.println(checkInclusion("dac","abcdca"));
    }
    public static boolean checkInclusion(String s1, String s2) {
        
        int n = s1.length();
       
        char [] arr1= s1.toCharArray();
        Arrays.sort(arr1);
        String a = new String(arr1);

        for(int i=0 ; i<s2.length()-n; i++){
            char [] arr2= s2.substring(i, i+n).toCharArray();
            Arrays.sort(arr2);
            String b = new String(arr2);
            if (a.compareTo(b)==0) return true;
        }
        return false;  
    }

}