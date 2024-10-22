import java.util.*;
class App43 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Random r=new Random();
		
		int n;
		do
			n=r.nextInt(100000);
		while(n<10000);

		System.out.println("Your OTP:"+n);
		System.out.print("Enter OTP to prove that you are 
												not a robo:");
		int x=sc.nextInt();
	
		if(n==x)
			System.out.println("Proceed");
		else
			System.out.println("Robo has no access..");
	}
}
