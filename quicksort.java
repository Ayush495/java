
public class quicksort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int [] a= {0,1,1,0,0,1};
     quick(a);
	}
	
	 public static  void quick(int[]a){
		 int start=0;
		 int end=a.length-1;
		 int temp;
		 while(start<end){
			 
			 while(a[start] == 0 && start<end)
			 {
				 start++;
			 
			 }
			 while(a[end] ==1 && start<end)
			 {
				 end--;
			 }
			 if(start<end){
				temp=a[start];
				a[start]=a[end];
				a[end]=temp;
				start++;
				end--;
			 }
			 
			 		 }
		 for(int i=0;i<a.length;i++){
			 System.out.println(" "+a[i]+ " ");
		 }
			 
		 
	 }

}
