package comp.ArrayListStudendsManagement;

public interface StudentsMethods {
//Arraylist 	methods for C R U D 
	public void addStudentRecord(int id, int t, int e, int h, int sc, int so, int m, String name);
	public void readStudentRecord();
	public void updateStudentRecord(int index,int id, int t, int e, int h, int sc, int so, int m, String name);
	public void deleteStudentRecord(int index);
	
	
//LinkedList Methods for CRUD	
	
	public void addStudentRecoordLL(int id, int t, int e, int h, int sc, int so, int m, String name);
	public void readStudentRecordLL();
	public void updateStudentRecordLL(int index,int id, int t, int e, int h, int sc, int so, int m, String name);
	public void deleteStudentRecordLL(int index);
	
	
//normal methods
	
	public void total();
}
