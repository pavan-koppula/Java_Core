package comp.sampleprojects;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanf =new Scanner(System.in);
		int a,b;
		System.out.println("Enter first number a=");
		a=scanf.nextInt();
		System.out.println("Enter second number b=");
		b=scanf.nextInt();
		
		System.out.println("enter your arthmatic operation:");
		char oper=scanf.next().charAt(0);
		
		switch(oper) {
		case '+':{	
			System.out.println("addition="+(a+b));
			break;
		}
		case '-':{	
			System.out.println("sub="+(a-b));
			break;
		}
		case '*':{	
			System.out.println("Mul="+(a*b));
			break;
		}
		case '/':{	
			System.out.println("Div="+(a/b));
			break;
		}
		default:{
			System.out.println("you have entered wrong operator");
		}
		}
		
		
		scanf.close();

	}

}
