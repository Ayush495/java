import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;


public class adjacent {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    String s=new String("abbcd");
    adjacentremove(s);
	}

	private static void adjacentremove(String s) {
		// TODO Auto-generated method stub
		//the reason why linked hashset is used because the order is important.
		LinkedHashSet hash=new LinkedHashSet();
		for(int i=0;i<s.length();i++){
			char pos=s.charAt(i);
			if(hash.add(pos)!= true){
				hash.add(pos);
			}
		}
		
		System.out.println("Hash"+hash);
		
	}
}