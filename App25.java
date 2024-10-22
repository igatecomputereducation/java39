import java.util.*;
class App25 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter any natural number:");
		var n=sc.nextInt();
		var gr=(n%9==0)?9:n%9;
		System.out.println("Your number:"+gr);
		switch(gr)
		{
			case 9,7,3:
				System.out.println("Lucky");
				break;
			case 5,8:
				System.out.println("ok");
				break;
			default:
				System.out.println("Better change number");
		}
	}
}
