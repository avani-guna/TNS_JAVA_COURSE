package library;

public class LibraryUser {
	private String name;
	private int id;
	private int totalbook;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getTotalbook() {
		return totalbook;
	}
	public void setTotalbook(int totalbook) {
		this.totalbook = totalbook;
	}
	@Override
	public String toString() {
		return "LibraryUser [name=" + name + ", id=" + id + ", totalbook=" + totalbook + "]";
	}
	

}
