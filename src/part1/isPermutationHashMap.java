import java.util.HashMap;
public class isPermutationHashMap {
	static HashMap map = new HashMap();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		boolean result = isPermutation("dnymo", "mondy");
		System.out.println("The result is: " + result);
	}
	
	
	public static boolean isPermutation(String text, String pattern)
	{
		char saveFirstLetterInText;
		int numberRepresentation = 0;
		int secondNumberRepresentation = 0;
		int numMatches = 0;
		
		if(text.length() != pattern.length())
			return false;
		
		for(int i = 0; i <= text.length()-1; i++)
		{
			saveFirstLetterInText = text.charAt(i);
			numberRepresentation = saveFirstLetterInText;
			map.put(numberRepresentation, saveFirstLetterInText);
			
		}
		
		for(int i = 0; i < text.length(); i++)
		{
			char saveSecondLetterInText; 
			saveSecondLetterInText = pattern.charAt(i);
			secondNumberRepresentation = saveSecondLetterInText;
			if(map.containsKey(secondNumberRepresentation))
			{
				numMatches++;
			}
		}
		
		if(numMatches == text.length())
		{
			return true;
		}
		return false;
	}

}
