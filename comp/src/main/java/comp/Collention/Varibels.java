package comp.Collention;

public class Varibels {
	int id;
	String name;
	public Varibels(int i, String string) {
		// TODO Auto-generated constructor stub
		this.id=i;
		this.name=string;
	}
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
	@Override
	public String toString() {
		return "Varibels [id=" + id + ", name=" + name + "]";
	}

}
