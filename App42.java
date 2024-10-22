import java.util.*;
class App42
{
	public static void main(String[] args) 
	{
		Random r=new Random();
		for(var i=1;i<=20;)
		{
			int n=r.nextInt(1000);
			if(n>=100)
			{
				System.out.println(n);
				i++;
			}
		}
	}
}