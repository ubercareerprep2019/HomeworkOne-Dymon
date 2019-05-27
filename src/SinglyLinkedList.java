
public class SinglyLinkedList {

	Node head;
	
	public void insertNode(Node element, int index)
	{
		Node pointer = head;
		int count = 0;
		if(head == null)
			{
			head = element;
			System.out.println("Inserting element @" + pointer);
			}else 
			{
				

			}
		

	}
	public void pushBack (Node element)
	{
		Node pointer = head;
		System.out.println(head);
		System.out.println(pointer);
		
		if(head == null)
		{
		 head = element;
		}else {
			
			while(pointer != null)
			{
				if(pointer.next == null)
				{
					pointer.next = element;
				}else {
					pointer = pointer.next; 
					
				}
				
			}
		}
		
	}
	
	public int popBack()
	{
		Node pointer = head;
		int saveValue;
		if(head == null)
		return -1;
		
		if(head.next == null)
		{
			int save = head.data;
			head = null;
			return save;
		}
		while(pointer.next != null && pointer.next.next != null)
		{
			pointer = pointer.next;
			
		}	
			saveValue = head.data;
			pointer.next = null;
			return saveValue;
				
	}
	
	public Node elementAt(int index)
	{
		return head;	
	}
	
public static void main(String agrs[])
{
	
	SinglyLinkedList list = new SinglyLinkedList();
	
	Node element = new Node(4);
	Node nextelement = new Node(3);
	
	list.insertNode(element,2);
	//System.out.println(element);
	list.insertNode(nextelement,5);
	System.out.println(nextelement.data);
	System.out.println(element.data);
	System.out.println(list.popBack());
	

}

}



