// Stack implemented by single node.
package Own;
public class Stack<E>{
	private class Node{
		E value;
		Node next;
		Node(E v){
			this.value = v;
		}
	}
	Node top;
	int size;

	public Stack(){
		size = 0;
	}

	public Stack(E value){
		this.top = new Node(value);
		size = 1;
	}

	public void push(E value){
		Node newNode = new Node(value);
		if(top==null){
			top = newNode;
		}else{
			newNode.next = top;
			top = newNode;
		}
		size++;
	}

	public boolean isEmpty(){
		return top==null;
	}
	
	public E pop(){
			E value = (E)top.value;
			top = top.next;
			size--;
			return value;
	}

	public E peek(){
			return (E)top.value;
	}

	public int size(){
		return size;
	}
	
	public E removeBottom(){
		Node prev = top;
		Node current = top.next;
		while(current!=null&&current.next!=null){
			prev = prev.next;
			current = current.next;
		}
		E value = current.value;
		prev.next = null;
		return value;
	}

	public static void main(String[] args){
		Stack<String> ins1 = new Stack<String>();
		// Stack ins2 = new Stack(12);
		// for(int i = 0; i<2; i++){
		// 	System.out.println(ins1.pop());
		// 	System.out.println(ins2.pop());
		// }
		for(int i = 0; i<12; i++){
			ins1.push("sdfs");
			// ins2.push(i*10);
		}
		// for(int i = 0; i<20; i++){
		// 	System.out.println(ins1.pop());
		// 	System.out.println(ins2.pop());
		// }
		System.out.println(ins1.removeBottom());
		System.out.println(ins1.removeBottom());
		for(int i = 0; i<13; i++){
			if(!ins1.isEmpty())
			System.out.println(ins1.pop());
		}		
	}
}