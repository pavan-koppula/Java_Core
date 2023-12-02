package comp.Assignements;

import java.util.Scanner;

public class StudentMarks {

	public static void main(String[] args) {
		
	
		
	Scanner in=new Scanner(System.in);
	int t,h,e,m,s,ss;
	System.out.println("enter marks in order");
	System.out.println("Telugu=");
	t=in.nextInt();
	System.out.println("Hindi=");
	h=in.nextInt();
	System.out.println("English=");
	e=in.nextInt();
	System.out.println("Maths=");
	m=in.nextInt();
	System.out.println("Science=");
	s=in.nextInt();
	System.out.println("Social=");
	ss=in.nextInt();
	
int Total=(t+h+e+m+s+ss);
System.out.println("Total Markes="+(Total));

int Avg=Total/6;
System.out.println("Average="+(Avg)+"%");


if(m<=35 & h<=35 & t<=35 & e<=35 & s<=35 & ss<=35) {
	System.out.println("Pass");
}	else {
		System.out.println("Fail");
	}



if(Avg>=85) {
	System.out.println("Excelent");
}
else if(Avg>=75) {
	System.out.println("Very Good");
}
else if(Avg>=65) {
	System.out.println("Good");
}
else if(Avg>=55) {
	System.out.println("Average");
}
else if(Avg>=45) {
	System.out.println("Bellow Average");
}
else if(Avg>=35) {
	System.out.println("avg Pass");
}
else {
	System.out.println("Fail");
}
	}

}


