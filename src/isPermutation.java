
public class isPermutation {

	public static void main(String[] args) 
	{
	
	 Boolean result =isStringPermuatation("a", "a");
	                 //isStringPermuatation("abb", "baa"); Wrong output
		
     if(result == true)
     {
	  System.out.println("The pattern is a permutation." );
	 
     }else{
	
	 System.out.println("Not a permutation." );
	 
    }
	
	
 }
	public static boolean isStringPermuatation(String s1, String s2)
	{

		char [] saveText = new char[s1.length()]; // Array for saving the string
		char [] savePermutation = new char[s2.length()];// Array for saving the permutation
		char saveFirstLetterInText;
		char saveFirstLetterInPerm;
		Boolean found = false;
		
		if(s1.length() != s2.length()) //Must have equal length
		{
			return false;
		}
			
		for(int i = 0; i< s1.length(); i++)
		{
			saveFirstLetterInText = s1.charAt(i);
			saveText[i] = s1.charAt(i); // Save the text
			
			for(int j = 0; j < s2.length(); j++)
			{
			  saveFirstLetterInPerm = s2.charAt(j); // Check first letter in permutation
			  if(saveFirstLetterInText == saveFirstLetterInPerm) //check if first letter in text is equal to first letter in permutation
			   {
				savePermutation[i] =saveFirstLetterInPerm; // If equal, save that letter from the permutation in array
				
			   }
			
			}
			
		}
	
		for(int i = 0; i < s1.length(); i++)
		{
			if(savePermutation[i] == saveText[i]) // Check if text array is equal to permutation array
			{
				found = true;
			}else {
				found=false;
			}
		}
		return found;
    }
}