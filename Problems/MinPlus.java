import java.io.*;

class MinPlus{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String exp = br.readLine();
        String[] exp2 = exp.split("=");
        String num1 = exp2[0];
        String num2 = exp2[1];
        Solution s = new Solution();
        System.out.println(s.Solve(num1, num2,0));
    }
}

class Solution{
    public int Solve(String num1,String num2,int count){
        for(int i=1;i<num1.length();){
            if(num1.equals(num2))
                return count;
            if(Integer.parseInt(num1.substring(i))+Integer.parseInt(num1.substring(0,i)) == Integer.parseInt(num2)){
                return ++count;
            }else{
                int a = Integer.parseInt(num1.substring(0,num1.length()-1)) + Integer.parseInt(num1.substring(num1.length()-1));
                num1 = Integer.toString(a);
                return Solve(num1, num2, ++count);
            }
        }
        return count;
    }
}

/*
    Input : 11111=5
    Output : 4

    Input : 153=54
    Output : 1

    Input : 111=3
    Output : 2
*/