
public class sumofdigits {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		
		int x=find();
		if(x==1)
		System.out.println("Yes Found");
		else
			System.out.println("Not found");
	}

	private static int find() {
		// TODO Auto-generated method stub
		int div=0;
		int sum=0;
		int n=19;
		for(int i=0;i<10;i++){
			while(n!=0){
				div=n%10;
				sum=sum+div*div;
				n=n/10;
			}
			System.out.println(sum);
			if(sum == 1){
				return 1;
			}		
		n=sum;
		sum=0;
	}
		return 0;

	}
}
