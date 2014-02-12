package Own;
import java.util.Arrays;

public class Stack<E> {
	private int size = 0;
	private static final int DEFAULT_SIZE = 10;
	private Object elements[];

	public Stack(){
		elements = new Object[DEFAULT_SIZE];
	}

	public Stack(int size){
		elements = new Object[size];
	}

	public void push(E e){
		if(size==elements.length){
			ensureCapa();
		}
		elements[size++] = e;
	}

	public E pop(){
		E e = (E) elements[size-1];
		elements[size] = null;
		size--;
		return e;
	}
	
	public boolean isEmpty(){
		return size==0;
	}

	private void ensureCapa(){
		System.out.println("Resizing from "+elements.length+" to "+elements.length*2);
		int newSize = elements.length*2;
		elements = Arrays.copyOf(elements, newSize);
	}
	
	public static void main(String[] args){
		Stack<String> ins = new Stack<String>(12);
		for(int i = 0; i<90; i++){
			ins.push("haha");
		}
		
		while(!ins.isEmpty()){
			System.out.println(ins.pop());
		}

	}
}
