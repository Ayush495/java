import java.util.Scanner;


public class binarysearch {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={2,5,8,1,6};
		binaryserach(a);
	
		
	}

	private static void binaryserach(int[] a) {
		// TODO Auto-generated method stub
		System.out.println("---------------Enter the no to find-------------");
		Scanner in=new Scanner(System.in);
		int n=a.length;
		int find=in.nextInt();
		int first=0;
		int last=n-1;
		int mid=0;
		
		while(first<last){
			mid=(first+last)%2;
			if(a[mid] == find){
				System.out.println("Found"+a[mid]);
				break;
			}
			else if(a[mid] < find){
				first=mid+1;
			}
			else{
				last=mid-1;
			}	
		}
		
		
	}

}
