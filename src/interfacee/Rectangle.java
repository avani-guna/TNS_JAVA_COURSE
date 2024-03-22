package interfacee;

public class Rectangle implements Resizable{

	@Override
	public void resizeWidth(int width) {
		System.out.println("updated width is :"+width);
		
	}

	@Override
	public void resizeHeight(int height) {
		System.out.println("updated height is:"+height);
		
	}

}
