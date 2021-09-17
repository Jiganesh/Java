//Balanced Brackets Problem

import java.util.*;
class JavaStack{
	
	public static void main(String []argh)
	{
		Scanner sc = new Scanner(System.in);
        Stack<Character> open = new Stack<>();    
        
		while (sc.hasNext()) {
            open.clear();
			String input=sc.next();
            for(int i=0;i<input.length();i++){
                if(!open.isEmpty()){
                    switch(input.charAt(i)){
                        case '}' : 
                        if(open.peek() == '{'){
                            open.pop();
                        }
                        break;
                        case ')' : 
                        if(open.peek() == '('){
                            open.pop();
                        }
                        break;
                        case ']' : 
                        if(open.peek() == '['){
                            open.pop();
                        }
                        break;
                        default: open.push(input.charAt(i));
                        break;
                    }
                }else{
                    open.push(input.charAt(i));
                }
            }
            System.out.println(open.isEmpty());
		}
        sc.close();
	}
}
