/*
PROB:7
Implement a program to extract digits from the given 
number

Input Format
a number from the user

Constraints
Number>0

Output Format
print digits in line separated by space

Sample Input 0
123
Sample Output 0
3 2 1

Sample Input 1
758
Sample Output 1
8 5 7

Sample Input 2
1207
Sample Output 2
7 0 2 1
*/

import java.util.*;
class App60 
{
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);

		var n=sc.nextInt();

		if(n>0)
		{
			while(n!=0)
			{
				System.out.print(n%10+" ");
				n=n/10;
			}
		}
	}
}
