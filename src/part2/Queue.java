public class Queue {

	int[] array = new int [10];
	int topofQ = -1;
	int bottomofQ = -1;
	
	public void enqueue(int x)
	{
	
			topofQ++;
			array[topofQ] = x;
			
		
	}
	
	public int dequeue()
	{
		int poppedValue = 0;
		
		if(array.length ==0)
		{
			return 0;
		}else
		{
			bottomofQ++;
			poppedValue = array[bottomofQ];
			array[bottomofQ] = 0;
		}
		
		return poppedValue;
	}
	
	
	public static void main(String agrs[])
	{
		
		Queue queue = new Queue();
		
		queue.enqueue(12);
		queue.enqueue(16);
		queue.enqueue(34);
		queue.enqueue(67);
		
	
		System.out.println("Popped value : "+ queue.dequeue());
		System.out.println("Popped value : "+queue.dequeue());
		System.out.println("Popped value : "+queue.dequeue());
		System.out.println("Popped value : "+queue.dequeue());
		
		
	
	}
	
}
