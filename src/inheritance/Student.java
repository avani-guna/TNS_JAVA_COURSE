package inheritance;



public class Student extends Citizen {
	public Student(int uid, String email, String name, int adharno) {
		super(uid, email, name, adharno);
		// TODO Auto-generated constructor stub
	}

	private String coursename;

	public String getCoursename() {
		return coursename;
	}

	public void setCoursename(String coursename) {
		this.coursename = coursename;
	}

	@Override
	public String toString() {
		return "Student [coursename=" + coursename + ", getUid()=" + getUid() + ", getEmail()=" + getEmail()
				+ ", getName()=" + getName() + ", getAdharno()=" + getAdharno() + "]";
	}

	
	

}
