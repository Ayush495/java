import java.util.Scanner;


public class Binary {

	/**
	 * @param args
	 */
	
	public static void count(String str){
		char[] a=str.toCharArray();
		int count=0;
		for(int i=0;i<a.length;i++){
			if(a[i]=='0'){
				count++;}	
			
		}
		System.out.println("count"+count);
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="";
		System.out.println("Enter decimal number");
		Scanner scanner= new Scanner(System.in);
		int input=scanner.nextInt();
		while(input!=1){
			str=input%2+str;
			input=input/2;
		}
		str="1"+str;
		System.out.println("binary:"+str);
		count(str);

	}

}
