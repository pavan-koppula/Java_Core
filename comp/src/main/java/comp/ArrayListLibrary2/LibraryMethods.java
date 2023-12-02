package comp.ArrayListLibrary2;

public interface LibraryMethods {
	public void CreateLibrary(int Bno,String Bname,String Writer);
	public void ReadLibrary();
	public void UpdateLibrary(int index, int Bno,String Bname,String Writer);
	public void DeleteLibrary(int index);
	
	//---------------LinkedList--------------
	public void CreateLibraryll(int Bno,String Bname,String Writer);
	public void ReadLibraryll();
	public void UpdateLibraryll(int index, int Bno,String Bname,String Writer);
	public void DeleteLibraryll(int index);
	
}