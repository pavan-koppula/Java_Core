package comp.OopsMarks;

import java.util.Scanner;

public class MarksMain extends MarksImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		
		Varibels var=new Varibels();
		System.out.println("Enter Telugu Marks");
		var.setT(sc.nextInt());
		
		System.out.println("Enter English Marks");
		var.setE(sc.nextInt());
		
		System.out.println("Enter Hindi Marks");
		var.setH(sc.nextInt());
		
		System.out.println("Enter Maths Marks");
		var.setM(sc.nextInt());

		System.out.println("Enter Science Marks");
		var.setS(sc.nextInt());

		System.out.println("Enter Social Marks");
		var.setSs(sc.nextInt());
		
		
		MarksMain Mo=new MarksMain();
		Mo.telugu(var.getT());
		Mo.english(var.getE());
		Mo.hindi(var.getH());
		Mo.maths(var.getM());
		Mo.science(var.getS());
		Mo.social(var.getSs());
		System.out.println("Total marks "+Mo.total(var.getT(),var.getE(),var.getH(),var.getM(),var.getS(),var.getSs()));
		Mo.avg(var.getT(),var.getE(),var.getH(),var.getM(),var.getS(),var.getSs());
		
	}

}
