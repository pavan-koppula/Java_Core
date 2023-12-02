package comp.ArrayListLibrary2;

public class LibraryModel {
int Bno;
String Bname;
String Writer;
public LibraryModel(int bno, String bname, String writer) {
	super();
	Bno = bno;
	Bname = bname;
	Writer = writer;
}
@Override
public String toString() {
	return "LibraryModel [Bno=" + Bno + ", Bname=" + Bname + ", Writer=" + Writer + "]";
}
public int getBno() {
	return Bno;
}
public void setBno(int bno) {
	Bno = bno;
}
public String getBname() {
	return Bname;
}
public void setBname(String bname) {
	Bname = bname;
}
public String getWriter() {
	return Writer;
}
public void setWriter(String writer) {
	Writer = writer;
}
}
