package interfacee;

public class Realme implements phone{

	@Override
	public void call() {
		System.out.println("calling using realme");
		
	}

	@Override
	public void sms() {
		System.out.println("messaging using realme");
	}

}
