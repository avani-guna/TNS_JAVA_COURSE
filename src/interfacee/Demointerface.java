package interfacee;

public class Demointerface implements Calculation {

	
	int num1;
	int num2;
	
	
	public Demointerface(int num1, int num2) {
		
		this.num1 = num1;
		this.num2 = num2;
	}
	public int printresult() {
		
	
		int num3=num1+num2;
		
		
	return num3;
	}
	public static void main(String[] args) {
		Demointerface di=new Demointerface(7,9);
	
	System.out.println(di.printresult());
		
	}

}
