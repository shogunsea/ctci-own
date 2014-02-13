package Own;
import java.util.Stack;
public class Queue<T> {
	Stack<T> newStack;
	Stack<T> oldStack;

	public Queue(){
		newStack = new Stack<T>();
		oldStack = new Stack<T>();
	}

	public void enqueue(T value){
		newStack.push(value);
	}

	public T dequeue(){
		shift();
		T value = oldStack.pop();
		return value;
	}

	public boolean isEmpty(){
		return newStack.size()+oldStack.size()==0;
	}

	public int size(){
		return newStack.size()+oldStack.size();
	}

	private void shift(){
		if(oldStack.isEmpty()){
			while(!newStack.isEmpty()){
				oldStack.push(newStack.pop());
			}
		}
	}

	public static void main(String[] args){
		Queue<Integer> ins = new Queue<Integer>();
		for(int i = 0; i<100; i++){
			ins.enqueue(i);
		}
		while(!ins.isEmpty()){
			System.out.println(ins.dequeue());
		}


	}
}