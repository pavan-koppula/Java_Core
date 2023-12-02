package comp.OOPSCalculator;

import java.util.Scanner;

public class MainClaculator extends MethodsImpl {

	public static void main(String[] args) {
			
		Scanner scanf=new Scanner(System.in);
		
		
		
		
		Varibels var=new Varibels();
		System.out.println("Enter A Value: ");
		int x=scanf.nextInt();
		System.out.println("Enter B Value: ");
		int y=scanf.nextInt();
		
		var.setA(x);
		
		var.setB(y);
		
		
		
		
		MainClaculator mc=new MainClaculator();
		mc.add(var.getA(), var.getB());
		mc.sub(var.getA(), var.getB());
		mc.div(var.getA(), var.getB());
		mc.mul(var.getA(), var.getB());
		
		
		
	}}

	