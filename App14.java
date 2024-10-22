import java.util.*;
class App14 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x,y;

		System.out.print("Enter value into x:");
		x=sc.nextInt();
		System.out.print("Enter value into y:");
		y=sc.nextInt();

		x=x+y;
		y=x-y;
		x=x-y;

		System.out.println("Value of x:"+x);
		System.out.println("Value of y:"+y);
	}
}
