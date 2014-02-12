//In the classic problem of the Towers of Hanoi, you have 3 rods and N disks of different sizes which can slide onto any tower. The puzzle starts with disks sorted in ascending order of size from top to bottom (e.g., each disk sits on top of an even larger one). You have the following constraints:
//Only one disk can be moved at a time.
//A disk is slid off the top of one rod onto the next rod.

//A disk can only be placed on top of a larger disk.
//Write a program to move the disks from the first rod to the last using Stacks

package Own;
import java.util.Stack;
// Using three stacks to solve the Hanoi problem.
public class Hanoi{
	int num = 0;
	Stack<Integer> towerA;
	Stack<Integer> towerB;
	Stack<Integer> towerC;

	public Hanoi(int plates){
		this.num = plates;
		towerA = new Stack<Integer>();
		towerB = new Stack<Integer>();
		towerC = new Stack<Integer>();
		for(int i = 0; i<plates; i++){
			towerA.push(plates-i);
		}
	}

	public void inspect(){
		StringBuffer sb = new StringBuffer();
		sb.append("===Inspecting elements in the towers===\n");
		sb.append("Tower A: [");
		for(int a:towerA){
			sb.append(a+",");
		}
		sb.append("]\n");
		sb.append("Tower B: [");
		for(int a:towerB){
			sb.append(a+",");
		}
		sb.append("]\n");
		sb.append("Tower C: [");
		for(int a:towerC){
			sb.append(a+",");
		}
		sb.append("]\n");
		System.out.println(sb.toString());
	}

	public void move(){
		helper(this.num, towerA, towerB, towerC);
	}

	public void helper(int num, Stack<Integer> source, Stack<Integer> buffer, Stack<Integer> target){
		inspect();
		if(num==1){
			target.push(source.pop());
			return;
		}
		helper(num-1, source, target, buffer);
		helper(1, source, buffer, target);
		helper(num-1, buffer, source, target);

	}

	public static void main(String[] args){
		int plates = 5;
		Hanoi ins = new Hanoi(plates);
		System.out.println("Before moving:");
		ins.inspect();
		ins.move();// move plates from tower 0 to 2, using 1 as buffer.
		System.out.println("After moving:");
		ins.inspect();
	}
	
	
	
}