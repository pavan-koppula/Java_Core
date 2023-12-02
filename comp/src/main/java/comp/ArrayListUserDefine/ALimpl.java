package comp.ArrayListUserDefine;

import java.util.ArrayList;

import comp.ArrayListLibrary2.LibraryModel;

public class ALimpl implements ALmethods{
	
	ArrayList<ALmodel> alm=new ArrayList<ALmodel>();
	
	public void CreatAL(int id, String name, int phno, String Address) {
		alm.add(new ALmodel(id,name,phno,Address));
		System.out.println("ArrayList created");
	}

	public void ReadAL() {
		// TODO Auto-generated method stub
		int i;
		for(i=0;i<alm.size();i++) {
			System.out.println(alm.get(i));
		}
	}

	public void UpdateAL(int index, int id, String name, int phno, String Address) {
		// TODO Auto-generated method stub
		alm.set(index, new ALmodel(id,name,phno,Address));
	}

	public void DeleteAL(int index) {
		// TODO Auto-generated method stub
		alm.remove(index);
	}

}
