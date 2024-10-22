import java.util.*;
class App22 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any integer:");
		int n=sc.nextInt();
		if(n>=-9 && n<=9)
			System.out.println("Single digit number");
		else if(n>=-99 && n<=99)
			System.out.println("Two digit number");
		else if(n>=-999 && n<=999)
			System.out.println("Three digit number");
		else if(n>999)
			System.out.println("Biggest number");
		else
			System.out.println("Smallest number");
	}
}
