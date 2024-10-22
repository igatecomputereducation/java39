import java.util.*;
class App35 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter any natural number:");
		var n=sc.nextInt();

		var count=0;
		for(var i=1;i<=n;i++)
		{
			if(n%i==0)
				count++;
		}
		
		if(count==2)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	}
}
