public class SinglyLinkedList
{    
    //Represent a node of the singly linked list    
    class Node
    {
    	int data;
    	Node next;
    	public Node(int data)
    	{
    		this.data=data;
    		this.next=null;
    	}
    }
    	public Node head=null;
    	public Node tail=null;
    	
    void add(int data)
    {
    	Node newNode=new Node(data);
    	if(head==null)
    	{
    		head=newNode;
    		tail=newNode;
    	}
    	else
    	{
    		tail.next=newNode;
    		tail=newNode;
    	}
    }
    
    void display()
    {
    	Node current=head;
    	if(head==null)
    	{
    		System.out.println("List is empty");
    		return;
    	}
    	System.out.println("Linked List Elements are:-");
    	while(current!=null)
    	{
    		System.out.println(current.data+"");
    		current=current.next;
    	}
    	System.out.println();
    }
    
    public static void main(String args[])
    {
    	SinglyLinkedList s=new SinglyLinkedList();
    	s.add(5);
    	s.add(4);
    	s.add(3);
    	s.add(2);
    	s.add(1);
    	s.display();
    }
}   