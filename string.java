
public class string {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="i am boy";
        char []a=str.toCharArray();
        String sbf="";
        for(int i=0;i<=a.length-1;i++){
        	sbf= a[i] + sbf;
        }
		System.out.println(sbf);
		
		
		
		
	}

}
