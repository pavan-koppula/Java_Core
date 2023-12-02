package comp.OopsMarks;

public class MarksImpl implements MarksMethods {

	public void telugu(int t) {
		// TODO Auto-generated method stub
	if(t>=35)
		{
		System.out.println("Telugu=Pass");
		}
	else
	{
		System.out.println("Telugu=Fail");
	}
}
	public void english(int e) {
		// TODO Auto-generated method stub
		if(e>=35)
		{
		System.out.println("English=Pass");
		}
	else
	{
		System.out.println("English=Fail");
	}
	}
	public void hindi(int h) {
		// TODO Auto-generated method stub
		if(h>=35)
		{
		System.out.println("Hindi=Pass");
		}
	else
	{
		System.out.println("Hindi=Fail");
	}
	}
	public void maths(int m) {
		// TODO Auto-generated method stub
		if(m>=35)
		{
		System.out.println("Maths=Pass");
		}
	else
	{
		System.out.println("Maths=Fail");
	}
	}
	public void science(int s) {
		// TODO Auto-generated method stub
		if(s>=35)
		{
		System.out.println("Science=Pass");
		}
	else
	{
		System.out.println("Science=Fail");
	}
	}
	public void social(int ss) {
		// TODO Auto-generated method stub
		if(ss>=35)
		{
		System.out.println("Social=Pass");
		}
	else
	{
		System.out.println("Social=Fail");
	}
	}
	public int total(int t, int e, int h, int m, int s, int ss) {
		// TODO Auto-generated method stub
		int tt=(t+h+e+m+s+ss);
//		System.out.println("Total Markes="+(tt));
		return tt;
	}
	public void avg(int t, int e, int h, int m, int s, int ss) {
		// TODO Auto-generated method stub
		
		int temp=total(t, e, h, m, s, ss);
		
		int avg=temp/6;
		System.out.println("Average="+(avg)+"%");
	}
}
