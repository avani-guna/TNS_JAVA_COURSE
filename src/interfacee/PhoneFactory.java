package interfacee;

public class PhoneFactory {
	public static Realme createRealme(String company) {
		Realme r=new Realme();
		return r;
	}
	public static Samsung createSamsung(String company) {
		Samsung s=new Samsung();
		return s;
	}
	public static phone createphone(String company) {
		if(company.equalsIgnoreCase("Samsung"))
			return new Samsung();
		else if(company.equalsIgnoreCase("Realme"))
			return new Realme();
		else
			return null;
	}

}
