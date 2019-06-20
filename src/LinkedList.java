import java.util.Queue;
import java.util.Stack;
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
	mylist.pushBack("m");
	mylist.pushBack("a");
	mylist.pushBack("d");
	mylist.pushBack("a");
	mylist.pushBack("m");

	
	//System.out.println(mylist.hasCycle());
	System.out.println(mylist.isPalindrome());
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
public boolean isPalindrome()
{
	Stack reservedPattern = new Stack();
	Stack pattern = new Stack();
	Node pointer = head;
	Node headPointer = head;
	while(pointer != null)
	{
		pattern.push(pointer);
		reservedPattern.push(pointer);
		pointer = pointer.next;
	
	}
	for(int i = size-1; i > 0; i--)
	{
		Node save = (Node) pattern.get(i);
		if(headPointer.data != save.data)
		{
			return false;
		}
			headPointer = headPointer.next;
		
	}
	return true;
	
}

public boolean hasCycle() {
	Node pointer = head;
	boolean result = false;
	Stack cycleStack = new Stack();
	
	if(head == null)
	{
		result = false;
	}else {
		
		while(pointer != null)
		{

			cycleStack.add(pointer);
			pointer = pointer.next;
		}
		for(int i = 0; i < cycleStack.size(); i++)
		{ 
		}
	}
	return false;
}	


}







