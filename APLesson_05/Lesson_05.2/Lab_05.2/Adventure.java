import java.util.Scanner;
public class Adventure
{
	public static void main(String[]args)
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("you are a spy who is in a bad guy's mansion and you need to get some information before you are caught. You enter through the basement and are now on the first floor.");
		System.out.println("The information you need is on the top floor but men with guns are gaurding the exits. What do you do? ");
		System.out.println("Would you" +  
		                    "\n 1. Just go for it and kick their butts. Or " + 
							"\n 2. Better do the stealth way and go through the vents. ");
	    String choice = kb.next();
		if (choice == 1)
		{
			System.out.println("You (obviously) beat them up but you were making to much noise so now you are capture and soon will be killed.");
			String choice1 = kb.next();
		}
		if (choice == 2)
		{
			System.out.println("You go through the vents and you find yourself on the thri floor. Good job!");
			String choice2 = kb.next();
		}
		
	    
		
	

	}
}