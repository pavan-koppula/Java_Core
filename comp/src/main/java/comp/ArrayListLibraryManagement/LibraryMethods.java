package comp.ArrayListLibraryManagement;

public interface LibraryMethods {
	public void addLibrary(int bno, String Bname, String writer);
	public void readLibrary();
	public void updateLibrary(int index,int bno, String Bname, String writer);
	public void deleteLibrary(int index);
	
	/*-------------LL------------*/
	public void addLibraryll(int bno,String Name, String Write);
	public void readLibraryll();
	public void updateLibraryll(int index,int bno,String Bname,String writer);
	public void deletLibraryll(int index);
}
