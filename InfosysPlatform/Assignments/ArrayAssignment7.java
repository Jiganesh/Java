import java.util.List;
import java.util.ArrayList;


class ArrayAssignment7{
    public static String[] findPermutations(String str){

        List<String> result = new ArrayList<String>();
        makepermutation(str, "",result);

        int i =0;
        String[] output =new String[6];

        for (String string : result) {
            output[i]=string;
            i++;
        }
        return output;
    
    }


    
    public static void makepermutation(String que, String answer,List<String> result){

        if (que.length()==0){
            if(! result.contains(answer)) result.add(answer);
            return;
        }
        
        for (int i= 0; i< que.length();i++){
            char ch = que.charAt(i);
            String left = que.substring(0, i);
            String right = que.substring(i+1);

            makepermutation(left+right, answer+ch,result);
        }
    }
    
    public static void main(String args[]){
        String str = "EYE";
        String [] permutations = findPermutations(str);

        for(String permutation: permutations){
            if (permutation!=null)
                System.out.println(permutation);
        }

    }
}


