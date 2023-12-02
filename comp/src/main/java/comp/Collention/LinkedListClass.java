package comp.Collention;
import java.util.LinkedList;

public class LinkedListClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<String> ll =new LinkedList<String>();
		ll.add("luffy");
		ll.add("zoro");
		ll.add("nami");
		
		System.out.println(ll);
		
		ll.set(1, "cupper");
		System.out.println("values after update"+ll);
		
		ll.remove("nami");
		System.out.println("values after delete  "+ll.get(0));
	}

}
