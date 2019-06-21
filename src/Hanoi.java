
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Hanoi {
	static Rod firstRod;
	static Rod secondRod;
	static Rod thridRod;
	int numberofDisk;
	
	
	public Hanoi(int n)
	{
		firstRod = new Rod();
		secondRod = new Rod();
		thridRod = new Rod();
		numberofDisk = n;
	}
	
	public static void main(String agrs[])
	{
		Hanoi game = new Hanoi(3);	
		game.playGame();

		
		Disk[] myAnswer = new Disk[6];
		myAnswer = disksAtRod(thridRod);
		for(int i = 0; i < myAnswer.length-1; i++)
		{
			System.out.println(myAnswer[i].priority);
		}
		
	}
	
	public void moveDisk(int startingRod, int destinationRod)
	{
		
		Rod destination = null;
		Rod start = null;
		Rod other = null;
		Disk saveTop;
		Disk saveTopofDestination;
		int i = 0;
		if(startingRod == 1)
		{
			start = firstRod;
		}else if( startingRod == 2)
		{
			start = secondRod;
		}else {
			
			start = thridRod;
		}
		
		if(destinationRod == 1)
		{
			destination = firstRod;
		}else if( destinationRod == 2)
		{
			destination = secondRod;
		}else {
			
			destination = thridRod;
		}
		
		if( (startingRod == 1 && destinationRod == 2) || (startingRod == 2 && destinationRod == 1) )
		{
			other = thridRod;
		}else if ((startingRod == 1 && destinationRod == 3) || (startingRod == 3 && destinationRod == 1)) {
			other = secondRod;
			
		}else if((startingRod == 2 && destinationRod == 3)  || (startingRod == 3 && destinationRod == 2))
		{
			other = firstRod;
		}
		
		saveTop  = (Disk) start.rod.get(i);
		
		if(destination.rod.size() == 0)
		{
			destination.rod.add(saveTop);
<<<<<<< HEAD
			
=======
			 destination.numDisk++;
>>>>>>> 2744b60ab5dbb463ed8594d5fc314bd3c643d052
			
		}else
		{
			 saveTopofDestination = (Disk) destination.rod.get(i);
			 
			 if(saveTop.priority > saveTopofDestination.priority)
			 {
				 other.rod.add(saveTop);
<<<<<<< HEAD
			
			 }else {
				 destination.rod.add(saveTop);
				 
=======
				 other.numDisk++;
				 
			 }else {
				 destination.rod.add(saveTop);
				 destination.numDisk++;
>>>>>>> 2744b60ab5dbb463ed8594d5fc314bd3c643d052
			 }
		}
		
		i++;
		
	}
		
	public int numberOfDisks()
	{
		return numberofDisk;
	}
		
	
	public static Disk[] disksAtRod(Rod index)
	{
		Rod currentRod = index;
		Disk[] myList = new Disk[currentRod.rod.size()];
		for(int i = 0; i< index.rod.size()-1; i++)
		{
			myList[i] = (Disk) currentRod.rod.get(i);
		}
		return myList;
		
	}
	
	public void playGame()
	{
		int input;
		System.out.println("Welcome to the Towers of Hanoi Game");
		System.out.print("Enter the number of disks to play with:");
		Scanner keyboard = new Scanner(System.in);
		input = keyboard.nextInt();
		
		for(int i = 0; i < input; i++)
		{
			int priority;
			System.out.print("Enter the priority for each disk:");
			priority = keyboard.nextInt();
			Disk disk = new Disk(priority);
			System.out.println("I've created a disk");
		}
		
		System.out.println("The Towers of Hanoi Menu");
		System.out.print("Enter a option value:");
		System.out.println("Enter 1: MoveDisk(from, to)");
		System.out.println("Enter 2: Print Disks at Rod(index)");
		System.out.println("Enter 3: Retrieve Number of Disks");
		int option = keyboard.nextInt();
		switch(input)
		{
	
		case 1:
		{
			System.out.print("Enter a start row index:");
			int index = keyboard.nextInt();
			System.out.print("Enter a end row index:");
			int endIndex = keyboard.nextInt();
			moveDisk(index,endIndex);
			
		}
		
		case 2:
		{
			System.out.println("Enter the index of the row");
			int index = keyboard.nextInt();
			Rod indexRod = null;
			if(index  == 1)
			{
				indexRod = firstRod;
			}
			
			if( index == 2)
			{
				indexRod = secondRod;
			}
			
			if(index == 3)
			{
				indexRod = thridRod;
			}
			disksAtRod(indexRod);
		}
		
		case 3: 
		{
			System.out.println("Number of Disks:" + numberOfDisks());
			
		}
		
		default:
		{	String answer;
			System.out.print("Would you like to continue?:");
		}
		
		}
	}
	
}



	


