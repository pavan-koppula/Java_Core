package comp.ArrayListStudendsManagement;

import java.util.ArrayList;
import java.util.LinkedList;

public class StudentsImpl implements StudentsMethods{
	ArrayList<Students> std=new ArrayList<Students>();
	
	LinkedList<Students> stdLL=new LinkedList<Students>();
	
	public void addStudentRecord(int id, int t, int e, int h, int sc, int so, int m, String name) {
		
		std.add(new Students(id,m,t,e,h,sc,so,name));
	}

	public void readStudentRecord() {
		
		int i;
		for(i=0;i<std.size();i++) {
			System.out.println(std.get(i));
		}
	}

	public void updateStudentRecord(int index,int id, int t, int e, int h, int sc, int so, int m, String name) {
		std.set(index, new Students(id, t, e, h, sc, so, m, name));
		
	}


	public void deleteStudentRecord(int index) {
		std.remove(index);
		System.out.println("std.hashCode()");
	}

	
	
	//-----------------------LL------------------------------------------
	
	
	public void addStudentRecoordLL(int id, int t, int e, int h, int sc, int so, int m, String name) {
		// LL adding a node// create

			stdLL.add(new Students(id, t, e, h, sc, so, m, name));

		
	}

	public void readStudentRecordLL() {
		// LL read
		
		int i;
		for(i=0;i<stdLL.size();i++) {
			System.out.println(stdLL.get(i));
		}
		
	}

	public void updateStudentRecordLL(int index, int id, int t, int e, int h, int sc, int so, int m, String name) {
		// update LL
		stdLL.set(index, new Students(id, t, e, h, sc, so, m, name));
		
	}

	public void deleteStudentRecordLL(int index) {
		// Delete Data
		stdLL.remove(index);
		
	}

	public void total() {
//	int tt=((stdLL.get(index).t)+(stdLL.get(index).e)+(stdLL.get(index).h)+(stdLL.get(index).m)+(stdLL.get(index).sc)+(stdLL.get(index).so));
//
//	System.out.println("total for "+stdLL.get(index).name+" of id: "+stdLL.get(index).id+" is: "+tt);
		int i;
	for(i=0;i<stdLL.size();i++) {
		int tt=((stdLL.get(i).t)+(stdLL.get(i).e)+(stdLL.get(i).h)+(stdLL.get(i).m)+(stdLL.get(i).sc)+(stdLL.get(i).so));
		System.out.println("ID: "+stdLL.get(i).id+" Name: "+stdLL.get(i).name+"  Total:"+tt);
	}
	}

}
