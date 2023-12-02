package comp.Assignements;

import java.util.Scanner;

public class calculator extends Claculatorchild{
	
public static void div(int a,int b) {
	System.out.println("reminder value is: "+(a/b));
}
	public static void main(String[] args) {
	Scanner scanf =new Scanner(System.in);
	int a,b;
	System.out.println("Enter first number a=");
	a=scanf.nextInt();
	System.out.println("Enter second number b=");
	b=scanf.nextInt();
	div(a,b);

	
	calculator cal=new calculator();
	
	cal.add(a, b);
	cal.sub(a, b);
	cal.mul(a, b);
	
	System.out.println(cal.getX());
	cal.setX(a);
	System.out.println(cal.getX());

	scanf.close();
	}
	
	


}
