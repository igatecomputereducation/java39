import java.util.*;
class App41 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter opening balance [>=500]:");
		var bal=sc.nextInt();

		if(bal<500)
			System.out.println("See you agian..");
		else
		{
			abc:while(true)
			{	
				System.out.print("1.Deposite\n2.Withdraw\n
				3.DispBal\n4.Exit\nEnter your choice [1..4]:");
				var ch=sc.nextInt();
			
				int amt;
				switch(ch)
				{
					case 1:
						System.out.print("Amount:");
						amt=sc.nextInt();
						bal+=amt;
						break;
					case 2:
						System.out.print("Amount:");
						amt=sc.nextInt();
						if(bal-amt>=500)
							bal-=amt;
						else
							System.out.println("Not enough balance.."); 
						break;
					case 3:
						System.out.println("Balance:"+bal);
						break;
					case 4:
						break abc;
					default:
						System.out.println("Invalid choice..");
				}//end of switch
			}//end of while
		}
	}
}