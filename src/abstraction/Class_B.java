package abstraction;


public class Class_B extends Marks {
	int sub1;
	int sub2;
	int sub3;
	int sub4;
	public Class_B(int sub1, int sub2, int sub3, int sub4) {
		
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
		this.sub4 = sub4;
	}
	public void getPercentage() {
		int pr=(sub1+sub2+sub3+sub4)/4;
		System.out.println("your percentage is:"+pr);
	}

}
