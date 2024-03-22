package inheritance;

public class SingleInheritance {
	public static void main(String[] args) {
		Student s=new Student(101,"avani@123.com","avani",90534213);
		s.setName("avani");
		s.setUid(101);
		s.setEmail("avani@123.com");
		s.setAdharno(90534213);
		s.setCoursename("it");
		System.out.println(s.toString());
	}

}
