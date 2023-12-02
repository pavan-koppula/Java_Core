package comp.pract;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
int n,r,s;int tem;
s=0;
System.out.println("Enter a number");
n=sc.nextInt();
tem=n;
while(n>0) 
{
	r=n%10;
	n=n/10;
	s=(s*10)+r;
	}
if(tem==s)
{
	System.out.println("Palindrome");
}
	else
	{
		System.out.println("Not Palindrome");
	}
}
}
