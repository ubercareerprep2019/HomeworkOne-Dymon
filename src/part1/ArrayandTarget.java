import java.util.HashSet;
public class ArrayandTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array ={4,3,8,1,4};
		int [] answer = pairsThatEqualSum(array, 12);
		
		for(int i = 0; i < answer.length; i++)
		{
			System.out.println(answer[i]);
		}
	}
	
	public static int [] pairsThatEqualSum(int [] arr, int target)
	{  	HashSet set = new HashSet();
		int[] pairs = new int[arr.length];
	for(int i = 0; i < arr.length-1; i++)
	{
		set.add(arr[i]);
	}
		for(int i = 0; i < arr.length-1; i++)
		{
			
			int element = arr[i];
			int match = target - element;
			if(set.contains(match))
			{
				pairs[i] = element;
				pairs[i+1] = match;
				
			}
			
			
		}
		
return pairs;
	}

}
