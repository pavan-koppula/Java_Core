package comp.ArrayListLibrary2;

import java.util.ArrayList;
import java.util.LinkedList;

public class LibraryImpl implements LibraryMethods {
	
	ArrayList<LibraryModel> all=new ArrayList<LibraryModel>();
	LinkedList<LibraryModel> ll= new LinkedList<LibraryModel>();
	
	public void CreateLibrary(int Bno, String Bname, String Writer) {
		// TODO Auto-generated method stub
		all.add(new LibraryModel(Bno, Bname, Writer));
		System.out.println("Record Created");
	}

	
	public void ReadLibrary() {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<all.size();i++)
		{
			System.out.println(all.get(i));
		}
	}

	public void UpdateLibrary(int index, int Bno, String Bname, String Writer) {
		// TODO Auto-generated method stub
		if(all.set(index, new LibraryModel(Bno, Bname, Writer)) == null) {
			System.out.println("Values not Updated");
		}else {
			System.out.println("Values Updated");
		}

	}


	public void DeleteLibrary(int index) {
		// TODO Auto-generated method stub
		if(all.remove(index)==null) {
			System.out.println("All data Deleted");
		}else {
			System.out.println("Values Deleted");
		}
	}

	//---------------LinkedList-------------------------
	
	//--------------Create-----------------------------
	public void CreateLibraryll(int Bno, String Bname, String Writer) {
		// TODO Auto-generated method stub
		ll.add(new LibraryModel(Bno,Bname,Writer));
		System.out.println("Created a Record");
	}


	public void ReadLibraryll() {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<ll.size();i++) {
			System.out.println(all.get(i));
		}
	}

	//-------------------Update------------
	public void UpdateLibraryll(int index, int Bno, String Bname, String Writer) {
		// TODO Auto-generated method stub
		if(ll.set(index, new LibraryModel(Bno, Bname, Writer))==null) {
			System.out.println("Failed to Update");
		}else {
			System.out.println("Updated");
			}
	}
		//-----------------Delete-------------------
	public void DeleteLibraryll(int index) {
		// TODO Auto-generated method stub
		ll.remove(index);
	}
}
