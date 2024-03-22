package hasarelationship;

public class Person {
	String name;
	double mobileno;
	Address ad;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getMobileno() {
		return mobileno;
	}
	public void setMobileno(double mobileno) {
		this.mobileno = mobileno;
	}
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", mobileno=" + mobileno + ", ad=" + ad + "]";
	}
	

}
