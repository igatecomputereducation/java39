import java.util.*;
class App32 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the limit:");
		var n=sc.nextInt();

		var sum=0;
		for(var i=1;i<=n;i++)
		{
			sum=sum+i;
		}

		System.out.println("Sum of natural numbers:"+sum);
	}
}