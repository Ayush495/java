import java.util.*;
import java.util.Map.Entry;
public class numberoflogins {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="user1,user4,user2,user1,user3,user1,user2";
		
		String[] a=str.split(",");
		int count=0;
		HashMap<String,Integer> hash=new HashMap<String,Integer>();
		for(int i=0;i<a.length;i++){
			if(hash.containsKey(a[i])==false)
			hash.put(a[i], 1);
			else
			hash.put(a[i],hash.get(a[i])+1);
		}
		Set<Entry<String, Integer>> set = hash.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }

		
		
	}

}
