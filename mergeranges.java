import java.util.Arrays;


public class mergeranges {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={10,15};
		int []b={11,30};
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		int max1=a[a.length-1];
		int max2=b[b.length-1];
		
		int min1=a[0];
		int min2=b[0];
		
		int min3=0;
		if((min2<max1 && min2>min1) || (min1<max2 && min1>min2) )
		{
		min3=min1>min2?min2:min1;
		//System.out.println("min3...."+min3);
		
		int max3=max1>max2?max1:max2;
		
		//System.out.println("max3...."+max3);
		
		int []c=new int[2];
		c[0]=min3;
		c[1]=max3;
		
		for(int i=0;i<c.length;i++)
			System.out.print("overlapping subsequence...."+c[i]);
		
	}
		else{
			System.out.println("dont overlap");
		}
		
		}
	
}
