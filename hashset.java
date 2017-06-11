import java.util.HashSet;


public class hashset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
int[]arr={1,3,45,7,1};

	HashSet<Integer> set=new HashSet<Integer>();
	int sum=8;
	int target=0;
	for(int i=0;i<arr.length;i++){
		target=sum-arr[i];
		if(set.add(target)== false){
		System.out.println("Sum is "+target+"&&&"+arr[i]);
		}
		else{
			set.add(arr[i]);
		}
	}
		
	}

}
