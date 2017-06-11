import java.util.Arrays;
import java.util.Scanner;


public class Missingcharacters {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in =new Scanner(System.in);
		System.out.println("Enter the string");
		String s=in.nextLine().toLowerCase();
		int a=0;
		char [] chars=s.toCharArray();
		int [] arr=new int[32];
		for(int i=0;i<26;i++){
			arr[i]=0;
		}
		
		for(int i=0;i<chars.length;i++){
		 a=chars[i]-97;
		 //System.out.println(a);
		 arr[a]=1;
		}
		
		for(int i=0;i<26;i++){
			//System.out.println(arr[i]);
			if(arr[i]==0){
				char a1=(char) (97+ i);
				System.out.print(a1);
			}
				
		}
		
		
		
	}

}
