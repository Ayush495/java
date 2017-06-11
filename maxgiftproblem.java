
public class maxgiftproblem {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][]matrixarray={   { 1,10,3,8 },
                { 12,2,9,6},
                { 5,7,4,11 },
                { 3,7,16,5 }
            };
		maxgift(matrixarray);
	}

	private static void maxgift(int[][] values) {
		// TODO Auto-generated method stub
		
		int rows = values.length;
	    int cols = values[0].length;
	    //System.out.println("rows_length"+rows+"column_length"+cols);
	    int[][] maxValues = new int[rows][cols];

	    for(int i = 0; i < rows; ++i) {
	        for(int j = 0; j < cols; ++j) {
	            int left = 0;
	            int up = 0;

	            if(i > 0) {
	                up = maxValues[i - 1][j];
	            }

	            if(j > 0) {
	                left = maxValues[i][j - 1];
	            }

	            maxValues[i][j] = Math.max(left, up) + values[i][j];
	            System.out.println("max_values"+maxValues[i][j]+".....i,j..."+i+j+left);
	        }
	    }

	    System.out.println("Answer"+maxValues[rows - 1][cols - 1]);
		
	}

}
