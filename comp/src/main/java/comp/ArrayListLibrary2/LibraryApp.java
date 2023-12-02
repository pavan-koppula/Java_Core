package comp.ArrayListLibrary2;

import java.util.Scanner;

public class LibraryApp extends LibraryImpl{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LibraryApp lol= new LibraryApp();
		
		Scanner sc=new Scanner(System.in);
		lol.CreateLibrary(1, "MyBook", "Pk");
		lol.CreateLibrary(2, "Name", "Tom");
		lol.CreateLibrary(3, "Fake", "feo");
		while(true) {
		System.out.println("--------------Select Your Option---------------");
		System.out.println("Enter 1 to Create Library Record ");
		System.out.println("Enter 2 to Read Library List ");
		System.out.println("Enter 3 to Update Library Record");
		System.out.println("Enter 4 to Delete Library Record");
		System.out.println("Enter 5 to Exit");
		int Select=sc.nextInt();
		switch (Select) {
		case 1:{
		//-------------Create-------------
			System.out.println("enter id:");
			int id=sc.nextInt();
			System.out.println("enter book name: ");
			String bkname=sc.next();
			System.out.println("enter writer name: ");
			String wrname=sc.next();
			
			lol.CreateLibrary(id, bkname, wrname);
			
		break;
		}
		case 2:{
		//------------Read-----------------
		lol.ReadLibrary();
		break;
		}
		case 3:{
		//------------update---------------
		lol.UpdateLibrary(1, 4, "NON", "Yeo");
		break;
		}
		case 4:{
		//--------------Delete-------------
		lol.DeleteLibrary(2);
		break;
		}
		case 5:{
			System.out.println("U are Exit");
			System.exit(0);
		}
		}
		}
	}
}

