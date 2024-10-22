import java.util.*;
class App15 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		int n,fi,se,th,sm;
		
		System.out.print("Enter any 3 digit natural number:");
		n=sc.nextInt();

		/*
		th=n%10;
		n=n/10;
		se=n%10;
		n=n/10;
		fi=n%10;
		*/

		/*
		th=n%10;
		se=n/10%10;
		fi=n/100;
		sm=fi+se+th;
		*/

		sm=n/100+n/10%10+n%10;
		System.out.println("Sum of all the digits:"+sm);
	}
}