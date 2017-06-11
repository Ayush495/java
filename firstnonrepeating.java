import java.util.*;
public class firstnonrepeating {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str="applea";
		int[] count=new int[256];
		for(int k=0;k<256;k++)
			count[k]=-9;
		
		for(int i=0;i<str.length();i++){
			int asc=str.charAt(i);
			//System.out.println(asc);
			if(count[asc]==-9){
				//System.out.println("yes"+count[asc]+asc);
			count[asc]=i;
			//System.out.println("no"+count[97]);
			}
			else{
				
			count[asc]=-1;	
			}
		}
		
		int firstIndex=Integer.MAX_VALUE;
		for(int j=0;j<count.length;j++){
			//System.out.println("j"+j+"count.."+count[j]);
			if(count[j]!=-1 && count[j]!=0 && j<firstIndex){
				//System.out.println("non repeating char is...."+(char)j+"..."+count[j]);
				firstIndex=count[j];
			}
			
		}
		System.out.println(firstIndex);
	}

}
