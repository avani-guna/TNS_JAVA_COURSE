package library;

public class LibraryPackageDemo {
	public static void main(String args[]) {
		Books b1=new Books();
		b1.setAuthor("abc");
		b1.setAvailibilitystatus(true);
		b1.setISBN("xyz");
		System.out.println(b1.toString());
		LibraryUser u1=new LibraryUser();
		u1.setId(101);
		u1.setName("avani");
		u1.setTotalbook(7);
		System.out.println(u1.toString());
		
		
	}

}
