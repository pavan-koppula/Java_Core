package comp.ArrayListLibraryManagement;

public class Library {
int bno;
@Override
public String toString() {
	return "Library [bno=" + bno + ", name=" + Bname + ", writer=" + writer + "]";
}
public int getBno() {
	return bno;
}
public void setBno(int bno) {
	this.bno = bno;
}
public String getName() {
	return Bname;
}
public void setName(String name) {
	this.Bname = name;
}
public String getWriter() {
	return writer;
}
public void setWriter(String writer) {
	this.writer = writer;
}
public Library(int bno, String name, String writer) {
	super();
	this.bno = bno;
	this.Bname = name;
	this.writer = writer;
}
String Bname;
String writer;
}
