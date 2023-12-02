package comp.sampleprojects;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternAndMatchings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
Scanner scan=new Scanner(System.in);
System.out.println("enter your gmail");

String mail=scan.next();

String pattern="^ [a-z]";
Pattern pat= Pattern.compile(pattern);

Matcher match=pat.matcher(mail);
if(match.find()==true) {
	System.out.println("you have entered correct mail");
}else {
	System.out.println("you have entered wrong mail");
}
	}

}
