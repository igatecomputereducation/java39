import java.util.*;
class App17 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter an integer:");
		int n=sc.nextInt();
		if(n==0)
		{
			System.out.println("zero");
		}
		if(n>0)
		{
			System.out.println("Positive");
		}
		if(n<0)
		{
			System.out.println("Negative");
		}
	}
}