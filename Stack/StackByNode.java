public class Stack{
	private class Node{
		int value;
		Node next;
		Node(int v){
			this.value = v;
		}
	}

	Node top;
	int size;

	public Stack(){
		size = 0;
	}

	public Stack(int value){
		this.top = new Node(value);
		size = 1;
	}

	public void push(int value){
		Node newNode = new Node(value);
		if(top==null){
			top = newNode;
		}else{
			newNode.next = top;
			top = newNode;
		}
		size++;
	}

	public int pop(){
		if(top==null){
			System.out.println("Stack is empty.");
			return -1;
		}else{
			int value = top.value;
			top = top.next;
			size--;
			return value;
		}
	}

	public int peek(){
		if(top==null){
			System.out.println("Stack is empty.");
			return -1;
		}else{
			return top.value;
		}
	}

	public int size(){
		return size;
	}
	public int removeBottom(){
		Node prev = top;
		Node current = top.next;
		while(current!=null&&current.next!=null){
			prev = prev.next;
			current = current.next;
		}
		int value = current.value;
		prev.next = null;
		return value;
	}

	public static void main(String[] args){
		Stack ins1 = new Stack();
		// Stack ins2 = new Stack(12);
		// for(int i = 0; i<2; i++){
		// 	System.out.println(ins1.pop());
		// 	System.out.println(ins2.pop());
		// }
		for(int i = 0; i<12; i++){
			ins1.push(i);
			// ins2.push(i*10);
		}
		// for(int i = 0; i<20; i++){
		// 	System.out.println(ins1.pop());
		// 	System.out.println(ins2.pop());
		// }
		System.out.println(ins1.removeBottom());
		System.out.println(ins1.removeBottom());
		for(int i = 0; i<13; i++){
			System.out.println(ins1.pop());
		}		




	}



}