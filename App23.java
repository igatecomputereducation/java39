import java.util.*;
class App23 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Price:");
		var price=sc.nextFloat();
		System.out.print("Quantity:");
		var qty=sc.nextInt();
		var bill=price*qty;
		var dis=(bill>=1000)?bill*5/100:bill*2/100;
		var nbill=bill-dis;
		System.out.println("=".repeat(20));
		System.out.println("Bill:"+bill+"\nDiscount:"+
					dis+"\nNetbill:"+nbill);
	}
}