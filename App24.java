import java.util.*;
class App24 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 2 integers..");
		var a=sc.nextInt();
		var b=sc.nextInt();
		System.out.print("1.Sum\n2.Subtraction\n3.Product\n
					4.Division\nEnter your choice [1..4]:");
		var ch=sc.nextInt();
		switch(ch)
		{
			case 1:
				System.out.println("Sum:"+(a+b));
				break;
			case 2:
				System.out.println("Subtraction:"+(a-b));
				break;
			case 3:
				System.out.println("Product:"+a*b);
				break;
			case 4:
				System.out.println("Division:"+(float)a/b);
				break;
			default:
				System.out.println("Invalid choice..");
		}
	}
}