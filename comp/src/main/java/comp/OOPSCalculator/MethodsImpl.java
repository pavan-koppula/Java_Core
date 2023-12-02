package comp.OOPSCalculator;

public class MethodsImpl extends Methods  {

	@Override
	public void add(int a, int b) {
		
		// TODO Auto-generated method stub
		System.out.println("Addition value is:  "+(a+b));
//		System.out.println("Addition value is:  "+(a-b));
		
	}

	@Override
	void sub(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("Subracted value is:  "+(a-b));
		
	}

	@Override
	void mul(int a, int b) {
		// TODO Auto-generated method stub
		System.out.println("multiplied value is:  "+(a*b));
	}

	@Override
	void div(int a, int b)  {
		// TODO Auto-generated method stub
			try
			{
		System.out.println("riminder value is:  "+(a/b));
			}
			catch (Exception e)
			{
			System.out.println("Arithamatic Exception");
			}
		}
	

}

