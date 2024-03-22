package interfacee;

public class Phone_Main {

	public static void main(String[] args) {
		phone p1=PhoneFactory.createphone("Samsung");
		p1.call();
		p1.sms();
		p1=PhoneFactory.createphone("realme");
		p1.call();
		p1.sms();

	}

}
