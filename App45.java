import java.util.*;
class App45 
{
	public static void main(String[] args) 
	{
		String x[]={"","Rock","paper","scissors"};
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		int uch,cch,uwcount=0,cwcount=0;
		
		for(var i=1;i<=5;i++)
		{
			System.out.println("****** Game "+i+" ******");

			do{
				System.out.print("1.Rock\n2.Paper\n3.Scissors
								\nEnter your choice [1..3]:");
				uch=sc.nextInt();
			}while(uch<1 || uch>3);

			do
				cch=r.nextInt(4);
			while(cch==0);

			System.out.println();
			System.out.println("You choice is "+x[uch]);
			System.out.println("Computer choice is "+x[cch]);

			if(uch==1 && cch==3)
			{
				System.out.println("You won");
				uwcount++;
			}
			else if(cch==1 && uch==3)
			{
				System.out.println("Computer won");
				cwcount++;
			}
			else if(uch>cch)
			{
				System.out.println("You won");
				uwcount++;
			}
			else if(cch>uch)
			{
				System.out.println("computer won");
				cwcount++;
			}
			else if(cch==uch)
				System.out.println("It is draw");

			System.out.println();
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