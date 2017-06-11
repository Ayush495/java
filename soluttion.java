// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class Soluttion {
    public int solution(int A, int B) {
        // write your code in Java SE 8
        String s1=String.valueOf(A);
    	String s2=String.valueOf(B);
    	String res="";
    	int len=0;
    	int len1=0;
    	String append="";
    	
    	if(s1.length()>s2.length()){
    		len=s2.length();
    		 len1=s1.length()-len;
    		 append=s1.substring(s1.length()-len1);
    	}
    	else{
    		len=s1.length();
    		 len1=s2.length()-len;
    		 append=s2.substring(s1.length()-len1);
    	}
    	
    	for(int i=0;i<len;i++){
    		res+=Character.toString(s1.charAt(i))+Character.toString(s2.charAt(i));
    	}
    	
    	res+=append;
    	//res=Character.toString(s1.charAt(0))+Character.toString(s2.charAt(0));
    	int finalsol=Integer.parseInt(res);
    	
    	return finalsol;
        
    }
}