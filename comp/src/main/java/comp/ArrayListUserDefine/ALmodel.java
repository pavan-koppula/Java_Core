package comp.ArrayListUserDefine;

public class ALmodel {
int id;
String name;
int Phno;
String Address;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getPhno() {
	return Phno;
}
public void setPhno(int phno) {
	Phno = phno;
}
public String getAddress() {
	return Address;
}
public void setAddress(String address) {
	Address = address;
}
@Override
public String toString() {
	return "ALmodel [id=" + id + ", name=" + name + ", Phno=" + Phno + ", Address=" + Address + ", i=" + i + "]";
}
public ALmodel(int id, String name, int phno, String address,int i) {
	super();
	this.id = id;
	this.name = name;
	Phno = phno;
	Address = address;
	
	
}
	int i;
	public ALmodel(int i) {
		super();
		this.i = i;
	}
	public int getI() {
		return i;
	}
	public void setI(int i) {
		this.i = i;
	}
	
}
