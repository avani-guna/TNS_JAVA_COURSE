package session;

public class Stack {
	public int arrsize;
	public int arr[];
	
		int top=-1;
		Stack(int size){
			arrsize=size;
			arr=new int[size];
			
		}
		void push(int val) {
			if(top==arrsize-1) {
				System.out.println("overflow");
				
			}
			else {
				top++;
				arr[top]=val;
				System.out.println("pushed element"+val);
				
			}
		}
			void pop() {
				if(top==-1){
					System.out.println("underflow");
				}
				else {
					int popvalue=arr[top];
					System.out.println("pop value"+popvalue);
					top--;
				}	
}
			void top() {
				if(top!=-1) {
					System.out.println("top element:"+arr[top]);
				}
				else {
					System.out.println("stack is empty");
				}
			}
			public static void main(String args[]) {
				Stack s=new Stack(3);
				s.push(25);
				s.push(61);
				s.push(54);
				s.push(65);
				s.top();
				s.pop();
				s.pop();
				
			}
	

}
