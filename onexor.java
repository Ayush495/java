import java.util.Arrays;


public class onexor {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,2,1,2,3};
		doxor(a);

	}
	
	static void doxor(int []a){
		int first=0;
		for(int i=0;i<a.length;i++){
			first^=a[i];
		}
		System.out.print(first);
	}
	
}
