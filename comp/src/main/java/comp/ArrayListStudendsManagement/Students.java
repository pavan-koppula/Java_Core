package comp.ArrayListStudendsManagement;

public class Students {
	int id,t,e,h,sc,so,m;
	@Override
	public String toString() {
		return "Students [id=" + id + ", t=" + t + ", e=" + e + ", h=" + h + ", sc=" + sc + ", so=" + so + ", m=" + m
				+ ", name=" + name + "]";
	}
	public Students(int id, int t, int e, int h, int sc, int so, int m, String name) {
		super();
		this.id = id;
		this.t = t;
		this.e = e;
		this.h = h;
		this.sc = sc;
		this.so = so;
		this.m = m;
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getT() {
		return t;
	}
	public void setT(int t) {
		this.t = t;
	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public int getH() {
		return h;
	}
	public void setH(int h) {
		this.h = h;
	}
	public int getSc() {
		return sc;
	}
	public void setSc(int sc) {
		this.sc = sc;
	}
	public int getSo() {
		return so;
	}
	public void setSo(int so) {
		this.so = so;
	}
	public int getM() {
		return m;
	}
	public void setM(int m) {
		this.m = m;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	String name;
}
