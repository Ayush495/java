import java.util.*;
public class hashtable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a={1,2,3,2,3};
	countarr(a);
}

	 static int countarr(int []a){
	int count []= new int[256];
	for(int j=0;j<a.length;j++)
		count[a[j]]=0;
		
	for(int i=0;i<a.length;i++)
	{
		count[a[i]]++;
	}
	for(int k=0;k<a.length;k++)
	{
		if(count[a[k]]==2)
		{
			System.out.println(a[k]);
		break;
		}
		
	}
	return 0;
	}
	}