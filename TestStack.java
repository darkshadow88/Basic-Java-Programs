//This class defines an integer stack that can hold 10 values.
class Stack{
	int stck[] = new int[10];
	int tos;

	// initialize top of stack
	Stack(){
		tos = -1;
		
		}
	//push
	void push(int item){
		if(tos == 9)
			System.out.println("Stack is full");
		else
			stck[++tos] = item;
		}
	//pop
	int pop(){
		if(tos < 0){
			System.out.println("Stack underflow");
			return 0;
			}

		else
			return stck[tos--];
		}
	}
class TestStack{
	public static void main(String args[]){
		Stack mystack1 = new Stack();
		Stack mystack2 = new Stack();
		
		//push some numbers onto the stack
		for(int i=0; i<10; i++) mystack1.push(i);
		for(int i=10; i<20; i++) mystack2.push(i);
		
		//pop some elements from the stack
		System.out.println("Mystack1");
		for(int i=0; i<10; i++)
		System.out.println(mystack1.pop());
			
		System.out.println("Mystack2");
		for(int i=0;i<10;i++)
		System.out.println(mystack2.pop());
		}
	}
