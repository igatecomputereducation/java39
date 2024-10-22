import java.util.*;
class App28 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int sum,x;

		System.out.println("Enter integers and 0 to stop..");

		sum=0;
		while(true)
		{
			x=sc.nextInt();
			if(x==0)
				break;
			sum=sum+x;
		}

		System.out.println("Sum of all the integers:"+sum);

	}
}
