import java.util.Arrays;


public class largestmul {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={2,2,4};
		int mul=0;
		Arrays.sort(a);
		int n=a.length;
		int j=0;
		for(int i=n-1;i>=0;i--){
			int div=a[i]%a[j];
			if(div ==0){
				int searchdiv=a[i]/a[j];
				int divreturn=search(searchdiv,a);
				if(divreturn ==1)
					System.out.println(a[i]);
				break;
			}
			
			j++;
		}
		
		
		System.out.println("-1");
	}

	private static int search(int searchdiv, int[] a) {
		// TODO Auto-generated method stub
		for(int i=0;i<a.length;i++){
			if(searchdiv ==a[i])
				return 1;
		}
		
		return 0;
		
	}

}
