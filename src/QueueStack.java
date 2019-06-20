
public class QueueStack {
	
	Stack queue = new Stack();
	int topofQ = -1;
	
	public void enqueue(int x)
	{
			if(queue.isEmpty())
			{
				topofQ++;
				queue.dataStore.add(topofQ, x);
			}else {
				
				
				queue.dataStore.add(topofQ, x);
			}
		

		
		
	}
	
	public int dequeue()
	{
		int value = 0;
		value = queue.pop();
		return value;
		
	}

	public static void main(String[] args) {
		QueueStack myQueue = new QueueStack();
		
		myQueue.enqueue(5);
		myQueue.enqueue(6);		
		myQueue.enqueue(7);	
		myQueue.enqueue(8);

		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		
		
	
	

	}

}
