package secondweek;

public class Person {
	private String name;
	private String email;
	private double income;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", email=" + email + ", income=" + income + ", age=" + age + "]";
	}
	public void checkeligibility() {
		if(age>18) {
			System.out.println("eligible to voting...");
		}
		else {
			System.out.println("not eligible");
		}
	}

}
