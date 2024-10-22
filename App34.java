import java.util.*;
class App34 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter the limit:");
		var n=sc.nextInt();

		var esum=0;
		var osum=0;
		for(var i=1;i<=n;i++)
		{
			if(i%2==0)
				esum+=i;
			else
				osum+=i;
		}

		System.out.println("Even numbers sum:"+esum);
		System.out.println("Odd numbers sum:"+osum);
	}
}
