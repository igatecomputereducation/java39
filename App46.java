import java.util.*;
class App46 
{
	public static void main(String[] args) 
	{
		//int[] a;
		int a[];
		a=new int[5];

		a[0]=45;
		a[1]=20;
		a[2]=a[0]+a[1];
		a[3]=a[0]-a[1];
		a[4]=a[0]*a[1];

		System.out.println("Sum:"+a[2]+"\nSubtraction:"+a[3]
			+"\nProduct:"+a[4]);

	}
}
