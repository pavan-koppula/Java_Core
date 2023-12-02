package comp.java8;

import java.util.ArrayList;
import java.util.List;

import comp.Collention.Varibels;
import comp.Collention.varibelse2;

//java8 or stream API
public class demojava8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Varibels> arr=new ArrayList<Varibels>();	 

		 arr.add( new Varibels(1,"ravi"));
		 arr.add(new Varibels(2, "pavan"));
	
		 
		 List<varibelse2> arr2=new ArrayList<varibelse2>();
		 arr2.add(new varibelse2("hyd"));
		 arr2.add(new varibelse2("vij"));
		 
		 
		 int i;
		 for(i=0;i<arr2.size();i++) {
			 System.out.println(arr2.get(i))
			 ;
		 }

	}

}
