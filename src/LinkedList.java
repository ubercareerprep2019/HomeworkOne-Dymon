public class LinkedList<T> {

	Node head; 
	Node tail;
	int size;
	
	public LinkedList()
	{
		this.head = null;
		tail = head;
		this.size = 0;
	}

public static void main(String agrs[])
{

	LinkedList mylist = new LinkedList();
	mylist.pushBack("a");
	mylist.pushBack("b");
	mylist.pushBack("c");
	mylist.pushBack("d");
	System.out.println("My current size is" + mylist.getSize());

	System.out.println("My element 1:" + mylist.elementAt(0));
	System.out.println("My element 2:" + mylist.elementAt(1));
	System.out.println("My element 3:" + mylist.elementAt(2));
	System.out.println("My element 4:" + mylist.elementAt(3));
	
	mylist.insert(2,8);
	mylist.insert(3,18);
	mylist.erase(4);
	mylist.popBack();
	System.out.println("After updates");
	System.out.println("My element 1:" + mylist.elementAt(0));
	System.out.println("My element 2:" + mylist.elementAt(1));
	System.out.println("My element 3:" + mylist.elementAt(2));
	System.out.println("My element 4:" + mylist.elementAt(3));


	System.out.println("My current size is" + mylist.getSize());
	
}


public void pushBack( T element) 
{
	Node next = new Node(element, null);
	
	if(tail == null)
	{
		tail = next;
		head = tail;
		size++;
	}else 
	{
		tail.next = next;
		tail = tail.next;
		size++;
	}
	
	
}

public T popBack()
{

T saveValue = null;

if(size == 0) 
{
	System.out.println("List is empty");
}

if(size == 1)
{
	saveValue= (T) tail.data;
	tail = null;


}else
{	Node pointer = head;
	while(pointer.next != tail)
	{
		pointer = pointer.next;
	}
	saveValue = (T) pointer.next.data;
	pointer.next = null;
	size--;
	tail = pointer;
	
}
return saveValue;
}



public int getSize()
{
	return size;
}


public T elementAt(int index) {
	
	T data = null;
	if(head == null)
	{
		System.out.println("List is null");
	}
	if(head.next == null)
	{
		data = (T) head.data;
		System.out.println("This element is" + data );
		return data;
	}else {
		
		if(index > size-1)
		{
			System.out.println("Index is greater than size");
		}else {
			Node curr = head;	
			for(int i = 0; i < index; i++)
			{  
				curr = curr.next;		
			}
			data =(T) curr.data;			
		}
	}
	return data;
}

public void erase(int index) {
	Node curr = head;
	T data;
	if(index >= size)
	{
		System.out.println("Index cannot be greater than size");
	}
	
	if(size == 0)
	{
		System.out.println("List is empty");
	}
	
	if(index == 0)
	{
		head = head.next;
		curr.next = null;
		size--;
		
	}else {
	
		for(int i = 0; i < index-1; i++)
		{
			curr = curr.next;	
		}
		Node pointer = curr.next;
		curr.next = curr.next.next;
		pointer.next = null;
		size--;
		
		}
		
	}

public void insert(int index, T element){
	Node next = new Node(element,null);
	Node curr = head;
	
	if(index >= size)
	{
		System.out.println("The index cannot be greater than the size");
	}
	
	if(size == 0)
	{
		tail = next;
	}
	
	if(size == 1)
	{
		tail.next = next;
		size++;
	}else {
		
		for(int i = 0; i < index-1; i++)
		{
			curr = curr.next;
		}		
		Node pointer = curr.next;
		curr.next = next;
		curr.next.next = pointer;
		size++;		
	}
	
}

}







