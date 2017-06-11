
public class productofn {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			product(100);
	}
	
	static void product(int n){
		int j=0;
		int []arr=new int[10];
		//For number less than 10//
		if(n<10){
			int sum=n+10;
			System.out.println("Product"+sum);
		}
		for(int i=9;i>1;i--){
			
			while(n%i ==0){
				n=n/i;
				arr[j]=i;
				j++;
			}
		}
		
		if(n>9){
		System.out.println("Exit");
	}
		 for (int i=j-1; i>=0; i--)
		        System.out.print(arr[i]);
		}
}
	
