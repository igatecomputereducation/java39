/*
PROB9:
Implement a program to calculate sum of even digits 
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
2

Sample Input 1
555
Sample Output 1
0

Sample Input 2
888
Sample Output 2
24

Sample Input 3
910
Sample Output 3
0

Sample Input 4
6
Sample Output 4
6



*/

import java.util.*;
class App62 
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

				if(x%2==0)
					sum=sum+x;

				n=n/10;
			}
			System.out.println(sum);

		}
	}
}
