import java.util.Scanner;


public class MatrixBinarySearch {

	
	
	public static void main(String args[]){
		Scanner in =new Scanner(System.in);
		
		int [][] a=new int[2][2];
		for(int i=0;i<2;i++){
			for (int j=0;j<2;j++){
				System.out.println("Enter the elements for the first array.");
				a[i][j]=in.nextInt();
			}
		}
	
		int result=formArray(a,4);
		if (result!=-1)
			System.out.println("Found"+result);
		else
			System.out.println("Not found");
		
	}

	private static int formArray(int[][] a,int value) {
		// TODO Auto-generated method stub
		int start=0;
		int last=a[0].length-1;
		System.out.println("Array length"+a[0].length);
		while(start<a[0].length && last>0){
			if(a[start][last]==value)
				return a[start][last];
			else if (a[start][last]>value)
				last--;//move left
			else
				start++;//move down as the array should be sorted
		}
		return -1;
	}
	
	
}
