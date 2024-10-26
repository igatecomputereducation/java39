/*
PROB9:
Implement a program to calculate sum of odd digits 
present in the given number.

Input Format
A number from the user

Constraints
Number>0

Output Format
Print sum of even digits

Sample Input 0
123
Sample Output 0
4

Sample Input 1
555
Sample Output 1
15

Sample Input 2
888
Sample Output 2
0

Sample Input 3
910
Sample Output 3
10

Sample Input 4
6
Sample Output 4
0



*/

import java.util.*;
class App63
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
				var x=n%10;

				if(x%2!=0)
					sum=sum+x;

				n=n/10;
			}
			System.out.println(sum);

		}
	}
}
