package hasarelationship;

public class Main {

	public static void main(String[] args) {
		Address adr=new Address();
		adr.setStreetname("abc");
		adr.setArea("plotvistar");
		adr.setPincode(380013);
		Person p=new Person();
		p.setAd(adr);
		p.setMobileno(94085676);
		p.setName("avani");
		System.out.println(p.toString());
	}

}
