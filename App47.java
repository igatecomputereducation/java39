import java.util.*;
class App47 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("How many integers..");
		var n=sc.nextInt();

		int[] a=new int[n];
		//var a=new int[n];

		System.out.println("Enter elements..");
		for(var i=0;i<n;i++)
			a[i]=sc.nextInt();

		System.out.println("Elements of array..");
		for(var i=0;i<n;i++)
			System.out.println(a[i]);

	}
}