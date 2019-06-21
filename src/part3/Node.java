public class Node<T>{
	// Creating an object node which consist of any type of data and a pointer to the next node
    T data;
	Node next;
	int numVisits;

    public Node( T data,Node next) {
    	
		this.next = next;
		this.data = data;
		
		
	}
	
 

	


}
