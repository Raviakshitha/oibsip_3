import java.util.*;
class GuessGame
{
	public void prepared()
	{
		Random r=new Random();
		Scanner sc=new Scanner(System.in);
		int val=r.nextInt(100);
		System.out.println("A Random Number is generated");
		System.out.println("Enter the number of guesses you want to try, guesses must be less than 10");
		int ch=sc.nextInt();
		while(ch>10)
		{
			System.out.println("Your chances exceeds.Please Enter number less than 10");
			ch=sc.nextInt();
		}
		System.out.println("You have "+ch+" Chances");
		int fscore=100,chance=0;
		for(chance=0;chance<ch;chance++)
		{

			System.out.println("Enter the number you guessed.Chance no"+(chance+1));
			int number=sc.nextInt();
			if(number==val)
			{
				System.out.println("That's Amazing ...You won the Game!");
				System.out.println("Your score is "+fscore);
				break;
			}
			else if(number>val)
			{
				System.out.println("Your number is greater than the original number");
			}
			else
			{
				System.out.println("Your number is less than the original number");
			}
			fscore-=10;
		} 
		if(chance>=ch)
		{
		    System.out.println("Alas!,You Lost the game");
			System.out.println("The number is "+val);
			System.out.println("Your score is: 0");
		}
	}
}
class Main
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
    	GuessGame f=new GuessGame();
    	System.out.println("Shall we start the game ? : Yes/No");
    	String str=sc.nextLine();
    	while(str.equalsIgnoreCase("Yes")||str.equalsIgnoreCase("y"))
    	{
    		f.prepared();
    		System.out.println("Do you want to proceed ? Yes/No");
    		str=sc.nextLine();
    	}
    	System.out.println("Game closed");
    }
}