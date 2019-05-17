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
		//Needs implementation
		return 0;
	}
	
	public boolean isEmpty()
	{
		boolean result;
		if(dataStore.isEmpty())
		{
			result = true;
		}else {
			result= false;
		}
		
		return result;
	}
	
	
	public static void main(String agrs[])
	{
		Stack data = new Stack();
		
		data.push(1);
		System.out.println(data.dataStore.size());
		data.push(2);
		data.push(3);
		data.push(4);
		data.push(64);
	
		System.out.println(data.pop());
		System.out.println(data.pop());
		System.out.println(data.pop());
		System.out.println(data.pop());
		
		//System.out.println(data.top());
		
		System.out.println(data.isEmpty());
	}
}

