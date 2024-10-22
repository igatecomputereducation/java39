import java.util.*;
class App44 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int cch,uch,cwcount=0,uwcount=0;

		for(var i=1;i<=5;i++)
		{
			System.out.println("*".repeat(16));
			do{
				System.out.print("Your choice 1..6:");
				uch=sc.nextInt();
			}while(uch<1 || uch>6);

			do
				cch=r.nextInt(7);
			while(cch==0);

			System.out.println("Computer choice:"+cch);

			if(uch==cch)
			{
				System.out.println("you won...");
				uwcount++;
			}
			else
			{
				System.out.println("Computer is the winner..");
				cwcount++;
			}
		
		}//end of for

		System.out.println("*".repeat(20));
		System.out.println("\tResult");
		System.out.println("*".repeat(20));

		System.out.println("You won for "+uwcount+" times");
		System.out.println("Computer won for "+cwcount+" times");
		
		if(uwcount>cwcount)
			System.out.println("You are the final winner");
		else
			System.out.println("Computer is the final winner");

	}
}