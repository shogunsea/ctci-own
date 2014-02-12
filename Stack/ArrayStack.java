package Own;
public class ArrayStack{
	public  int numberOfStacks;
	public  int unitCapacity;
	public  int[] array;
	public  int[] currentLast;

	public ArrayStack(int numberOfStacks, int unitCapacity){
		this.numberOfStacks = numberOfStacks;
		this.unitCapacity = unitCapacity;
		this.array = new int[numberOfStacks*unitCapacity];
		this.currentLast = new int[numberOfStacks];
		for(int i =0;i<numberOfStacks;i++){
			currentLast[i] = -1;
		}
	}

	public int peekAtIndex(int stackIndex){
		if(stackIndex>=numberOfStacks){
			return -1;
		}
		int current = getLastIndex(stackIndex);
		return array[stackIndex*unitCapacity+current];
	}

	public int getLastIndex(int stackIndex){
		return currentLast[stackIndex];
	}

	public int pop(int stackIndex){
		if(stackIndex>=numberOfStacks){
			return -1;
		}
		int current = getLastIndex(stackIndex);
		int value = array[stackIndex*numberOfStacks+current];
		// If a value is poped from the array, just set it to be 0.
		setIndex(stackIndex, 0);
		currentLast[stackIndex]--;

		return value;
	}

	public  void push(int stackIndex, int value){
		if(stackIndex>=numberOfStacks){
			return;
		}
		setIndex(stackIndex, value);
		currentLast[stackIndex]++;
	}
	// used by push method, as well as the pop method, which will set the element value to be 0.
	public void setIndex(int stackIndex, int value){
		int currentLast = 0;//currentLast[stackIndex];
		array[stackIndex*numberOfStacks+currentLast] = value;
		return;
	}

	public static void main(String[] args){
		ArrayStack ins  = new ArrayStack(3, 5);
		ins.push(0,10);
		ins.push(1,20);
		System.out.println(ins.pop(1));
		System.out.println(ins.pop(0));
	}
}





