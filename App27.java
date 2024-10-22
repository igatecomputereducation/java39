import java.util.*;
class App27 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		int x,y,sm;

		do{
			System.out.print("First number:");
			x=sc.nextInt();
		}while(x<=0);

		do{
			System.out.print("Second number:");
			y=sc.nextInt();
		}while(y<=0);


		sm=x+y;

		System.out.println("Addition:"+sm);


	}
}
