/*
PROB:2
Given an integer n, perform the following conditional 
actions,
If n is odd, print weird,
If n is even and in the inclusive range of 2 to 5, print not weird,
If n is even and in the inclusive range 6 to 20, print weird,
If n is even and greater than 20, print not weird.

Input Format
An integer value from the user.

Constraints
1<=n<=100

Output Format
Weird or Not Weird

Input
3
Output
Weird

Input
4
Output
Not Weird

Input
50
Output
Not Weird
*/


import java.util.*;
class App55 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		var n=sc.nextInt();

		if(n>=1 && n<=100)
		{
			if(n%2==0)
			{
				if(n>20)
					System.out.println("Not Weird");
				else if(n>=6)
					System.out.println("Weird");
				else if(n>=2)
					System.out.println("Not Weird");
			}
			else
				System.out.println("Weird");
		}
	}
}
