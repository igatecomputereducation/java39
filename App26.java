import java.util.*;
class  App26
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.print("Amount:");
		var amt=sc.nextInt();
		System.out.print("Time in months:");
		var time=sc.nextInt();
		System.out.println("Select loan type..");
		System.out.print("Gold(g)\nPersonal(p)
					\nBusiness(b)\nEducation(e) [g/p/b/e]:");
		char lt=sc.next().charAt(0);
		var si=switch(lt){
			case 'g'->amt*time*0.75/100;
			case 'p'->amt*time*1.75/100;
			case 'b'->amt*time*2.25/100;
			case 'e'->amt*time*1.25/100;
			default->0;
		};
		if(si!=0)
		{
			System.out.println("Amount:"+amt);
			System.out.println("Simple interest:"+si);
			System.out.println("Total:"+(si+amt));
		}
		else
			System.out.println("OOPs invalid loan type..");
	}
}