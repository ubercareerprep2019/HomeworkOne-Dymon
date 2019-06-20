public class ArrayandTarget {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] array ={1,2,3,4,5};
		int [] answer = pairsThatEqualSum(array, 5);
	
	for(int i =0; i<answer.length; i++)
	{
		System.out.println(answer[i]);
	}

	}
	
	public static int [] pairsThatEqualSum(int [] arr, int target)
	{  
		int total = 0;
		int save;
		int [] savedPairs = new int[arr.length];
		for(int i = 0; i <arr.length-1; i++)
		{
			save = arr[i];
			System.out.println(save);
			for(int j = i+1; j < arr.length; j++)
			{
				total = save + arr[j];
				//System.out.println("Save is"+ save +"Total is "+total);
				//System.out.println(arr[j]);
				if(total == target)
				{
					
					
					savedPairs[j-1] = save;
					savedPairs[j] = arr[j];
					System.out.println(arr[j]);
					System.out.println("Found total "+total+":"+ savedPairs[j]);
					
				}

			}
			
			//System.out.println(arr[i]);
		}
		
		
		return savedPairs;
	}

}
