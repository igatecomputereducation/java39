import java.util.*;
class App16 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		System.out.print("Length:");
		int len=sc.nextInt();
		System.out.print("Breadth:");
		int bre=sc.nextInt();

		int area=len*bre;
		int peri=2*(len+bre);

		System.out.println("Area:"+area);
		System.out.println("Perimeter:"+peri);
	}
}