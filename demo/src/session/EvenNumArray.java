package session;

public class EvenNumArray {
	public static void main(String args[]){
		int arr[]= {5,36,2,9,7,6,7};
		int count=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				count++;
			}
		}
		System.out.println(count);
	}
}
