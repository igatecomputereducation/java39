import java.util.*;
class App13 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int x,y,temp;

		System.out.print("Enter value into x:");
		x=sc.nextInt();
		System.out.print("Enter value into y:");
		y=sc.nextInt();

		temp=x;
		x=y;
		y=temp;

		System.out.println("Value of x:"+x);
		System.out.println("Value of y:"+y);
	}
}
