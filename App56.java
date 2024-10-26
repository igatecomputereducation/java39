/*
PROB3:
Implement a program to check whether the given year 
is leap year or not.

Input Format
Read year value as an integer from the user.

Constraints
Year>0

Leap Year: It is exactly divisible by 4 except 
for century year, if it is a century year then it 
must be divisible by 400.

Output Format
True or False

Input
1600
Output
True

Input
2020
Output
True

Input
2100
Output
False
*/


import java.util.*;
class App56 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		var year=sc.nextInt();

		if(year>0)
		{
			if(year%100==0 && year%400==0 || year%100!=0 && year%4==0)
				System.out.println("True");
			else
				System.out.println("False");


		}

	}
}
