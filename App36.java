import java.util.*;
class App36 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter any natural number:");
		var n=sc.nextInt();

		var flag=true;
		for(var i=2;i<n;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
				
			}
		}
		
		if(flag && n>1)
			System.out.println("Prime number");
		else
			System.out.println("Not a prime number");
	}
}
