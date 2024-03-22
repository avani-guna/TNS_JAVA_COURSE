package interfacee;

public class Samsung implements phone{

	@Override
	public void call() {
		System.out.println("calling using samsung");
	}

	@Override
	public void sms() {
		System.out.println("messaging using samsung");

}
	}
