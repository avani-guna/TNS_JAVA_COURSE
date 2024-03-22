package inheritance;

public class Citizen {
	private int uid;
	private String email;
	private String name;
	private int adharno;
	
	public Citizen(int uid, String email, String name, int adharno) {
		super();
		this.uid = uid;
		this.email = email;
		this.name = name;
		this.adharno = adharno;
	}
	public int getUid() {
		return uid;
	}
	public void setUid(int uid) {
		this.uid = uid;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAdharno() {
		return adharno;
	}
	public void setAdharno(int adharno) {
		this.adharno = adharno;
	}
	@Override
	public String toString() {
		return "Citizen [uid=" + uid + ", email=" + email + ", name=" + name + ", adharno=" + adharno + "]";
	}
	

}
