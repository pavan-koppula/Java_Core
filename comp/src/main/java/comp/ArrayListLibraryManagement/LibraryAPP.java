package comp.ArrayListLibraryManagement;

public class LibraryAPP extends LibraryImpl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LibraryAPP lapp=new LibraryAPP();
		
		//Creating a ArrayList
		lapp.addLibrary(1, "GOT", "abc");
		lapp.addLibrary(2, "HOD", "cba");
		lapp.addLibrary(3, "Money Heist", "xyz");
		
		//Read 
		lapp.readLibrary();
		
		//Update
		try{
		lapp.updateLibrary(1, 4, "Bio", "Rgv");
		System.out.println("Values Updated");
		lapp.readLibrary();
		}
		catch(Exception e){
			System.out.println("Run time Error"+e);
			
		//Delete
			lapp.deleteLibrary(2);
			lapp.readLibrary();
		}
	}
		

}
