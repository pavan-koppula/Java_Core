package comp.Interfaces;

import java.util.Scanner;



public class InterfaceMain extends InterfaceImpl{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Scanner scanf=new Scanner(System.in);
		
		Varibels var=new Varibels();
		
		System.out.println("Enter A Value: ");
		
		var.setA(scanf.nextInt());
		
//		int x=scanf.nextInt();
//		System.out.println("Enter B Value: ");
//		int y=scanf.nextInt();
//		
//		var.setB(y);
		
		InterfaceMain icm=new InterfaceMain();
		icm.square(var.getA());
		icm.root(var.getA());

	}

}
