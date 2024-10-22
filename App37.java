import java.util.*;
class App37 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter any natural number:");
		var n=sc.nextInt();

		if(n<2)
		{
			System.out.println("Not a prime number");
			System.exit(0);
		}
		
		for(var i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("Not a prime number");
				System.exit(0);
			}
		}
		
		System.out.println("Prime number");
	}
}