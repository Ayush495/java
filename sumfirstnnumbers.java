import java.util.Scanner;


public class sumfirstnnumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		String  s=in.nextLine();
		int s1=Integer.parseInt(s);
		int sum=0;
		for(int i=1;i<s1;i++){
		if(i%15 ==0){
		sum+=i;
		System.out.println("i"+i);
		}
		/*else if(i%5==0 || i%3 ==0){
		sum+=i;
		System.out.println("i"+i);
		}*/
		else
		sum=sum;
	}
System.out.println(sum);
	int sum1=s1*(s1-1);
	int sum2=sum1/2;
	int diff=sum2-sum;
	System.out.println("diff"+diff);
	
	
	

}
}
