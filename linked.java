
public class linked {

	static  class Node{
 String name;
 Node link;
	}
	
	static void create(){
		Node top=null;
		 top=new Node();
		top.name="a";
		top.link=null;
		Node temp=null;
		temp=new Node();
		temp.name="b";
		temp.link=top;
		top=temp;
		Node temp1;
		temp1=new Node();
		temp1.name="c";
		temp1.link=top;
		top=temp1;
		
		//print(top);
		Node x=reverse(top);
	     print(x);
	}
	static void print(Node topnode){
		
		
		while(topnode!=null)
		{
		System.out.print("top"+topnode.name  );
		topnode=topnode.link;
	}
		System.out.println();
	}
	static Node reverse(Node curr){
		Node prev=null;
		Node next=null;
		
		while(curr.link!=null){
			next=curr.link;
			curr.link=prev;
			prev=curr;
			curr=next;
			
		}
		
		return curr;
	}
		
		
		
	
	
	
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		create();
		
		

	}

}
