import java.util.*;
class App33 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any natural number:");
		var n=sc.nextInt();
		var fact=1;
		for(var i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial:"+fact);
	}
}