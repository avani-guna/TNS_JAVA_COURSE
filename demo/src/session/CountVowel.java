package session;

public class CountVowel {
	public static void main(String args[]) {
		String str="avani";
		char ch[]= {'a','e','i','o','u','A','E','I','O','U'};
		int vowel=0;
		for(int i=0;i<str.length();i++) {
			for(int j=0;j<ch.length;j++) {
		if(str.charAt(i)==ch[j]) {
			vowel++;
		}
				
		
		
		}
		
	}
		System.out.println(vowel);
	}

}
