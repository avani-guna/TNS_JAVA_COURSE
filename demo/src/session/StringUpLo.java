package session;

public class StringUpLo {
	public static void main(String args[]) {
		char name[]= {'A','e','l','l','o'};
		if(name[0]>='a'&& name[0]<='z') {
			System.out.println(Character.toUpperCase(name[0]));
		}
		else {
			System.out.println(Character.toLowerCase(name[0]));
		}
	}

}
