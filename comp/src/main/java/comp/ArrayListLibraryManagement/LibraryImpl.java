package comp.ArrayListLibraryManagement;

import java.util.ArrayList;
import java.util.LinkedList;

public class LibraryImpl implements LibraryMethods{
	
	ArrayList<Library> ar=new ArrayList<Library>();
	

	public void addLibrary(int bno, String Bname, String writer) {
		// TODO Auto-generated method stub
		ar.add(new Library(bno, Bname, writer));
	}

	public void readLibrary() {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<ar.size();i++) {
			System.out.println(ar.get(i));
		}
			
	}

	public void updateLibrary(int index, int bno, String Bname, String writer) {
		// TODO Auto-generated method stub
		
		ar.set(index, new Library(bno,Bname,writer));
	}

	public void deleteLibrary(int index) {
		// TODO Auto-generated method stub
		ar.remove(index);
		
	}
	
	/*----------------------LL---------------------*/
	LinkedList<Library> lll=new LinkedList<Library>();
	public void addLibraryll(int bno, String Name, String Write) {
		// TODO Auto-generated method stub
		lll.add(new Library(bno, Name, Write));
	}

	public void readLibraryll() {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<lll.size();i++) {
			System.out.println("Values "+lll.get(i));
		}
	}

	public void updateLibraryll(int index, int bno, String Bname, String writer) {
		// TODO Auto-generated method stub
		lll.set(index, new Library(bno, Bname, writer));
	}

	public void deletLibraryll(int index) {
		// TODO Auto-generated method stub
		lll.remove(index);
	}

}
