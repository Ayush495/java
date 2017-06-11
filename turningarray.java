
public class turningarray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Yo have to find where thes sorted array is turning.i.e:It becomes increasing to decreasing.
		int []a={1,2,3,4,5,10,9,8,7,6};
		
		int start=0;
		int end=a.length-1;
		
		while(start<end){
			int mid=(start+end)/2;
			System.out.println("md"+mid);
			if(a[mid-1]<a[mid]&& a[mid]>a[mid+1]){
				System.out.println("Found"+a[mid]);
				break;
			}
			else if(a[mid-1]>a[mid]){
				end=mid-1;
			}
			else{
				start=mid+1;
			}
			
		}
		
		
}
	}