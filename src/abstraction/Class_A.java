package abstraction;



public class Class_A extends Marks {
	int sub1;
	int sub2;
	int sub3;
	public Class_A(int sub1, int sub2, int sub3) {
		
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	public void getPercentage() {
		int pr=(sub1+sub2+sub3)/3;
		System.out.println("your percentage is:"+pr);
	}

}
