
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
//		System.out.println(myQueue.queue.dataStore.get(0));
		myQueue.enqueue(6);
//		System.out.println(myQueue.queue.dataStore.get(0));
//		System.out.println(myQueue.queue.dataStore.get(1));
		myQueue.enqueue(7);
//		System.out.println(myQueue.queue.dataStore.get(0));
//		System.out.println(myQueue.queue.dataStore.get(1));
//		System.out.println(myQueue.queue.dataStore.get(2));
		
		myQueue.enqueue(8);
//		System.out.println(myQueue.queue.dataStore.get(0));
//		System.out.println(myQueue.queue.dataStore.get(1));
//		System.out.println(myQueue.queue.dataStore.get(2));
//		System.out.println(myQueue.queue.dataStore.get(3));
		
		System.out.println(myQueue.queue.dataStore.get(0));
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		myQueue.dequeue();
		
		
	
	

	}

}
