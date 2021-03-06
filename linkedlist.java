
class linkedlist
{
   static class Node
   {
      String name;
      Node next;
   }
   public static void main (String [] args)
   {
      Node top = null;
      // 1. The singly linked list does not exist
      top = new Node ();
      top.name = "A";
      top.next = null;
      dump ("Case 1", top);
    //  Node revhead=    reverse(top);
    //  dump("reverse",revhead);
      // 2. The singly linked list exists, and the node must be inserted
      //    before the first node
      Node temp;
      temp = new Node ();
      temp.name = "B";
      temp.next = top;
      top = temp;
      dump ("Case 2", top);
      // 3. The singly linked list exists, and the node must be inserted
      //    after the last node
      temp = new Node ();
      temp.name = "C";
      temp.next = null;
      Node temp2;
      temp2 = top;
      while (temp2.next != null)
         temp2 = temp2.next;
      temp2.next = temp;
      dump ("Case 3", top);
      // 4. The singly linked list exists, and the node must be inserted
      //    between two nodes
      temp = new Node ();
      temp.name = "D";
      temp2 = top;
      while (temp2.name.equals ("A") == false){
         temp2 = temp2.next;
      temp.next = temp2.next;
      temp2.next = temp;}
      dump ("Case 4", top);
   }
   static void dump (String msg, Node topNode)
   {
      System.out.print (msg + " ");
      while (topNode != null)
      {
         System.out.print (topNode.name + " ");
         topNode = topNode.next;
      }
      System.out.println ();
   }
   static Node reverse(Node currentnode){
	   
	   Node prevNode=null;
	   Node nextNode=null;
	   while(currentnode!=null){
		   nextNode=currentnode.next;
		   currentnode.next=prevNode;
		   prevNode=currentnode;
		   currentnode=nextNode;
		   
		   
	   }
	   return prevNode;
	   
	   
   }
}