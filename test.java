import java.util.Scanner;


public class test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int  p=sc.nextInt();
		int  r=sc.nextInt();
		int  t=sc.nextInt();
		int ans=p*r*t;
		int ans1=(int) Math.ceil(ans/100);
		System.out.printf("%d",ans1);
	}

}
