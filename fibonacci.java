import java.util.*;

public class fibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner in=new Scanner(System.in);
		System.out.println("enter test cases");
		int t=in.nextInt();
		
		
		for(int i=0;i<t;i++){
			
			int c=0;
			System.out.println("Enter first number");
			int a=in.nextInt();
			System.out.println("Enter second number");
			int b=in.nextInt();
		for(int j=0;j<6;j++){
			c=a+b;
			a=b;
			b=c;
			
		}
		System.out.print(c);
			
			
		}
	}

}
