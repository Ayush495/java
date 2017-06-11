import java.util.*;
public class Diagonalmatrix {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating matrix
		Scanner in =new Scanner(System.in);
		System.out.println("Enter no. of rows");
		int row=in.nextInt();
		System.out.println("Enter no. of columns");
		int column=in.nextInt();
		int [][]a=new int[row][column];
		
		
		for(int i=0;i<row;i++){
			
			for(int j=0;j<column;j++){
				a[i][j]=in.nextInt();
			}
		}
		int sum1=0;
		int sum2=0;
		for(int i=0,j=0;i<row&&j<column;i++,j++){
			sum1=sum1+a[i][j];
		}
		
		for(int i=0,j=column-1;i<row&&j>=0;i++,j--){
			sum2=sum2+a[i][j];
		}
	System.out.println("sum1"+sum1+"sum2"+sum2);
		int diff=0;
		if(sum2>sum1){
		 diff=sum2-sum1;
		}
		else{
		diff=sum1-sum2;
		}
		System.out.println("diff"+diff);	
	}
}
