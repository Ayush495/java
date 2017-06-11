import java.util.Scanner;


public class gcd {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Scanner in=new Scanner(System.in);
      System.out.println("enter first no.");
      int a=in.nextInt();
      System.out.println("enter second no.");
      int b=in.nextInt();
      
      while(a>0){
    	  int c=b%a;
    	  b=a;
    	  a=c;	  
      }
      System.out.println("hcf is:"+b);
	
	
	
	
	}

}
