/*
PROB:1
Implement a program to check whether the given number 
is even number or odd number.

Input Format
An integer value

Constraints
n>=0

Output Format
even or odd or invalid

Input
12
Output
even

Input
13
Output 1
odd

Input
-12
Output
invalid
*/
import java.util.*;
class App54 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		var n=sc.nextInt();

		if(n>=0)
		{
			if(n%2==0)
				System.out.println("even");
			else
				System.out.println("odd");
		}
		else
			System.out.println("invalid");
	}
}