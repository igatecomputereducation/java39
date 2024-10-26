/*
PROB:8
Implement a program to calculate sum of digits present 
in the given number.

Input Format
A number from the user

Constraints
Number>0

Output Format
print sum of digits

Sample Input 0
123
Sample Output 0
6

Sample Input 1
1200
Sample Output 1
3

Sample Input 2
100
Sample Output 2
1

Sample Input 3
195
Sample Output 3
15
*/

import java.util.*;
class App61 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		var n=sc.nextInt();

		if(n>0)
		{
			var sum=0;
			while(n!=0)
			{
				sum=sum+n%10;
				n=n/10;
			}
			System.out.println(sum);

		}
	}
}
