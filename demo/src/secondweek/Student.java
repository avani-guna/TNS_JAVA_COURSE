package secondweek;

public class Student {
	private String name;
	private int enrollmentno;
	private String branch;

	public Student(String name, int enrollmentno, String branch) {
		super();
		this.name = name;
		this.enrollmentno = enrollmentno;
		this.branch = branch;
	}
	public Student() {
		System.out.println("default constructor");
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public int getEnrollmentno() {
		return enrollmentno;
	}
	public void setEnrollmentno(int enrollmentno) {
		this.enrollmentno = enrollmentno;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", enrollmentno=" + enrollmentno + ", branch=" + branch + "]";
	}
	

}
