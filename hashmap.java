import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;


public class hashmap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
	Scanner sc=new Scanner(System.in);
	int[] arr={3,4,56,7,8};
	HashMap<Integer,Integer> hash=new HashMap<Integer,Integer>(); 
	for(int i=0;i<arr.length;i++){
		hash.put(i, arr[i]);
	}
	
	for(Integer i:hash.values()){
		System.out.println("Values is"+i);
		//System.out.println("value  is"+hash.get(i));
	
	}
	}
}
