import java.util.*;
class App50 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("How many elements:");
		int n=sc.nextInt();

		int[] a=new int[n];

		System.out.println("Enter the elements..");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}

		int sum=0;
		for(int t:a)
		{
			sum=sum+t;
		}

		System.out.println("Sum of elements:"+sum);
	}
}