import java.util.*;
public class operator_overload {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			boolean x=balanceoperator("{(a,b)}");
			System.out.println(x);
	}

	static boolean balanceoperator(String s){
		
		Stack<Character> s1=new Stack<Character>();
		
		for(int i=0;i<s.length();i++){
		char ch=s.charAt(i);
		if(ch=='{'||ch =='('|| ch=='['){
			s1.push(ch);
		}
		else if(ch==']'){
			if(s1.isEmpty())
				return false;
			if(s1.pop()!='[')
				return false;
			
		} 
		
		else if(ch=='}'){
			if(s1.isEmpty())
			return false;
			if(s1.pop()!='{')
				return false;
		}
		
		else if(ch==')'){
			if(s1.isEmpty())
				return false;
				if(s1.pop()!='(')
					return false;
			
		}
		}
		
		return s1.isEmpty();
		
	}
	
}
