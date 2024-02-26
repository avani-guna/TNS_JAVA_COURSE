package session;

import java.util.Scanner;

public class Area_main {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter length:");
		int l=sc.nextInt();
		System.out.println("enter breadth:");
		int b=sc.nextInt();
		Area a=new Area();
		a.setdim(l, b);
		System.out.println("area of rectangle is: "+a.getarea());
	}

}
