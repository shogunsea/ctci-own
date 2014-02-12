package Own;

public class MinStack{
	private class Node{
		int val;
		int min;
		Node next;
		Node(int val, int min){
			this.val = val;
			this.min = min;
		}
		int val(){
			return this.val;
		}
		int min(){
			return this.min;
		}
	}

	int size;
	int capacity;
	Node top;

	public MinStack(int capacity){
		this.capacity = capacity;
		this.size = 0;
	}

	public boolean isEmpty(){
		return top==null;
	}

	public boolean isFull(){
		return size==capacity;
	}

	public int pop(){
		int value = top.val();
		top = top.next;
		size--;
		return value;
	}

	public int min(){
		int min = top.min();
		return min;
	}

	public void push(int value){
		if(top==null){
			top = new Node(value, value);
			return;
		}
		int currentMin = top.min()>value? value:top.min();
		Node newNode = new Node(value, currentMin);
		newNode.next = top;
		top = newNode;
		size++;
	}

	public static void main(String[] args){
		MinStack ins = new MinStack(10);
		for(int i = 15; i<30; i++){
			System.out.println("Pushing "+ (i-14) +" elements.");
			if(!ins.isFull()){
				ins.push(i);
				System.out.println("Current min is: "+ ins.min());
			}
		}

		for(int i = 0; i<15; i++){
			System.out.println("Poping "+ i +" times.");
			if(!ins.isEmpty()){
				System.out.println("Current min is: "+ ins.min());
				System.out.println(ins.pop());
				
			}
		}
	}
}