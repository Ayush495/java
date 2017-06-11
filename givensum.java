import java.util.HashSet;


public class givensum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stu
		int [] nums={1,2,3,4,5,7};
		HashSet<Integer> a=new HashSet<Integer>(nums.length);
		for(int i=0;i< nums.length;i++){
			int v=8-nums[i];
			if(!a.contains(v)){
				a.add(nums[i]);
			}
			else{
				System.out.print("num is "+nums[i]);
				System.out.println( "value is"+v);
			}
		}
		
		
		
		
	}

}
