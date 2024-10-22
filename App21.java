import java.util.*;
class App21 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 3 integers..");
		var a=sc.nextInt();
		var b=sc.nextInt();
		var c=sc.nextInt();
		if(a==b && b==c)
		{
			System.out.println("Equals");
		}
		else
		{
			if(a>b && a>c)
			{
				System.out.println("Biggest number:"+a);
			}
			else
			{
				if(b>c)
					System.out.println("Biggest number:"+b);
				else
					System.out.println("Biggest number:"+c);
			}
		}
	}
}