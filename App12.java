import java.util.*;
class App12 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		float price,bill;
		int qty;
		System.out.print("Price:");
		price=sc.nextFloat();
		System.out.print("Quantity:");
		qty=sc.nextInt();
		bill=price*qty;
		System.out.println("Total bill:"+bill);
	}
}
