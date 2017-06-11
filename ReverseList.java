
public class ReverseList {

	/**
	 * @param args
	 */
	static class Node{
		
		int data;
		Node next;
		
	}
	
	public static Node create(){
		Node head=new Node();
		int []a={2,3,4,5,6};
		
		//System.out.println("Head data"+head.data);
		Node top=head;
		head.data=a[0];
		for(int i=1;i< a.length;i++){
			top.next=new Node();
			top=top.next;
			top.data=a[i];
			
		}
		reverse(head);
		return head;
		
	}
	
	public static void reverse(Node head){
		Node temp=null;
		Node next=null;
		while(head != null){
			next=head.next;
			head.next=temp;
			temp=head;
			head=next;
			
		}
		
		while(temp !=null){
			System.out.println("tem.data"+temp.data);
			temp=temp.next;
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Node printl=create();
		/*while(printl!= null){
			System.out.print(printl.data+" ");
			printl=printl.next;
		}
		*/
	}
	

}
