import java.util.Scanner;


public class combination {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int a=in.nextInt();
		int r=in.nextInt();
		int c=permutation(a);
		int d=permutation(r);
		System.out.println(c+"..."+d);
			
	}

	private static int permutation(int a) {
		// TODO Auto-generated method stub
		int f=1;
		for(int i=a;i>0;i--){
		f=f*i;
		}
		return f;
	}

}
