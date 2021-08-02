public class CapgeminiProblem2 {
    public static void main(String[] args) {
        StringMethods sm = new StringMethods();
        StringPlay sp = new StringPlay();
        System.out.println(sm.getMax(sp,"fgfgfgf", 'g'));
        System.out.println(sm.convertToInt(sp,"123"));
    }
}
class StringPlay{
    int convert;
    int max;

    StringPlay(){}
}

class StringMethods{
    public int convertToInt(StringPlay sp, String str){
        return Integer.parseInt(str);
    }
    public int getMax(StringPlay sp,String str, char ch){
        int count =0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                count++;
            }
        }
        return count;
    }
}
