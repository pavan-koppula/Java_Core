package comp.ArrayListStudendsManagement;

public class StudentsAPP extends StudentsImpl{

	public static void main(String[] args) {
	
		
		
		// Array List		
		StudentsAPP sapp= new StudentsAPP();
		//creating a record
		sapp.addStudentRecord(1, 45, 67, 34, 89, 90, 70, "luffy");
		sapp.addStudentRecord(2, 67, 70, 80, 80, 50, 90,"zoro");
		sapp.addStudentRecord(3, 55, 60, 70, 90, 40, 60, "nami");
		//reading 
//		sapp.readStudentRecord();
		
		//update
		try {
			sapp.updateStudentRecord(2, 4, 56, 67, 67, 78, 89, 90, "cupper");;
//			System.out.println("values are updated");
//			sapp.readStudentRecord();
		}catch(Exception e){
			System.out.println("error here"+e);
		}
		
		
		
		//delete
		try {			
			sapp.deleteStudentRecord(0);
//			System.out.println("values are deleted");
//			sapp.readStudentRecord();
		}catch(Exception e) {
			System.out.println("error here "+e);
		}
		
		
		
		//LinedList
		
		StudentsAPP sLLApp=new StudentsAPP();
		//adding to LL
		sLLApp.addStudentRecoordLL(101, 45, 65, 87, 35, 87, 24, "dora");
		sLLApp.addStudentRecoordLL(102, 85, 35, 77, 25, 57, 74, "black");
		sLLApp.addStudentRecoordLL(102, 59, 45, 77, 65, 77, 34, "allen");
		sLLApp.addStudentRecoordLL(104, 59, 45, 77, 65, 77, 34, "alex");
		//reading
		sLLApp.readStudentRecordLL();
		
		try {
		
//		sLLApp.updateStudentRecordLL(1, 110, 34, 34, 54, 56, 23, 75, "brown");
//		System.out.println("values after updated");
//		sLLApp.readStudentRecordLL();
		}
		catch(Exception e) {
			System.out.println("exception here"+e);
		}
		
		//delete
		try {	
//			sLLApp.deleteStudentRecordLL(0);
//			System.out.println("values after deletion");
//			sLLApp.readStudentRecordLL();
		}catch(Exception e) {
			System.out.println(e);
		}
		
		
		//normal method
	
//		sLLApp.total();
	}

}
