import java.util.*;
public class sameline {

	/**
	 * @param args
	 */
	
	static HashMap<Integer,Double> hash=new HashMap<Integer,Double>();
	
	static void noOfPoints(int X[],int Y[],int N) {
		double m=0.0;
		int duplicatepoints=0;
		
		for(int i=0;i<N-1;i++){
		if(Y[i+1]==Y[i] && X[i+1]==X[i]){
			duplicatepoints++;		
		}
		
		 m =Y[i+1]==Y[i]? 0.0:(1*Y[i+1]-Y[i])/(X[i+1]-X[i]);
		 hash.put(i,m);
		}
        
		for(Double x:hash.values()){
			System.out.println("slopes are"+x);
		}
		System.out.println("No. of duplicate points are"+duplicatepoints);
   }
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a={1,2,3,1};
		int [] b={4,5,6,4};
		Arrays.sort(a);
		Arrays.sort(b);
		noOfPoints(a, b, 4);
		
	}

}
