import java.util.*;
class App38 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter any natural number:");
		var n=sc.nextInt();

		var sum=0;
		while(n!=0)
		{
			sum=sum+n%10;
			n=n/10;
		}

		System.out.println("Sum of all the digits:"+sum);
	}
}
