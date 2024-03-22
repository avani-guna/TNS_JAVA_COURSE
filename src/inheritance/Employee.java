package inheritance;

public class Employee extends Citizen{
    private String Designation;

	public Employee(int uid, String email, String name, int adharno, String designation) {
		super(uid, email, name, adharno);
		Designation = designation;
	}

	@Override
	public String toString() {
		return "Employee [Designation=" + Designation + ", getUid()=" + getUid() + ", getEmail()=" + getEmail()
				+ ", getName()=" + getName() + ", getAdharno()=" + getAdharno() + "]";
	}
	
	

}
