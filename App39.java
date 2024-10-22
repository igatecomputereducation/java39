import java.util.*;
class App39 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Enter any natural number:");
		var n=sc.nextInt();

		var temp=n;
		
		var rev=0;
		
		while(n!=0)
		{
			rev=rev*10+n%10;
			n=n/10;
		}

		System.out.println("Reverse number:"+rev);

		if(rev==temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");

	}
}
