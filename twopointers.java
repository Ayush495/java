import java.util.Arrays;


public class twopointers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums={1,3,4,6,8,8,9};
      twopointers(nums,7);
	}
	
	public static  void twopointers(int []a,int n) {
		int first=0;
		int last=a.length-1;
		//System.out.println(last);
		Arrays.sort(a);
		while(first<last){
			if(a[first]+a[last]==n){
				System.out.printf("%d and %d \n",a[first],a[last]);
				first++;
				last--;
				
			}
			else if(a[first]+a[last] < n){
				first++;
			}
			else if(a[first]+a[last] > n){
				last--;
			}
			else
				System.out.println("not present");
			
			
		}
			
			
			
			
			
		}
		
		
		
		
		
	}
	
	


