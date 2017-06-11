
public class tree {

	/**
	 * @param args
	 */
	static class Node{
		int data;
		Node left;
		Node right;
		
	}

	static Node createtree(Node top){
		top.left=null;
		top.right=null;
		top.data=3;
		return top;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Node head=new Node();
		head.data=5;
		head.left=createtree(head);
		//head.right=createtree(head);	
		//System.out.println("head.data"+head.data);
		//Node x=head.left;
		//System.out.println("head.left"+x.data);
		Node x=head.left;
		System.out.println("head.left"+x.data);
	}

}
