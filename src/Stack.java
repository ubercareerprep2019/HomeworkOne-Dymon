import java.util.ArrayList;

public class Stack {

	int topofStack = -1;
	ArrayList dataStore = new ArrayList();

	
	
	public Stack()
	{
		this.topofStack = -1;
		this.dataStore = new ArrayList();
		
	}
	
	public void push(int x)
	{
		if(dataStore.isEmpty())
		{
			dataStore.add(x);
			topofStack = 0;
		
			
		}else {
			topofStack++;
			dataStore.add(topofStack, x);

			
			
		}
	}
	
	public int pop()
	{
		int topElement = 0;
		if(dataStore.isEmpty())
		{
			return 0;
		}
		
		topElement = (int) dataStore.remove(dataStore.size()-1);
		return topElement;
		
		
	}
	
	public int top()
	{
		int top  = 0;
		if(dataStore.isEmpty())
		{
			return 0;
		}
		
		top = (int) dataStore.get(topofStack);
		return top;
		
	}
	
	public boolean isEmpty()
	{
		boolean result = false;
		if(dataStore.isEmpty())
		{
			result = true;
		}
		return result;
	}
	
	
	public static void main(String agrs[])
	{
		Stack data = new Stack();
		int poppedValue; 
		data.push(42);
		System.out.println("Printing the top of the stack after a push: " + data.top());
		System.out.println("Printing size: "+ data.dataStore.size());
		poppedValue = data.pop();
		System.out.println("Printing the popped value: " + poppedValue);
		System.out.println("Printing size: "+ data.dataStore.size());
		
		
		
		
	}
}

