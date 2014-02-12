package Own;
import java.util.ArrayList;
public class Subsets{
	public static ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> list){
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		if(list.size()==0){
			result.add(new ArrayList<Integer>());
			return result;
		}
		ArrayList<Integer> tempList = new ArrayList<Integer>();
		for(int i = 0; i<= list.size(); i++){
			helper(list, result, tempList, i, 0);
		}

		return result;
	}

	public static void helper(ArrayList<Integer> list, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> tempList, int len, int index){
		if(tempList.size()==len){
			result.add(new ArrayList<Integer>(tempList));
			return;
		}

		for(int i = index; i<list.size(); i++){
			tempList.add(list.get(i));
			helper(list, result, tempList, len, i+1);
			tempList.remove(tempList.size()-1);
		}
	}

	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i = 0; i<4; i++){
			list.add(i);
		}
		System.out.println(list.toString());

		ArrayList<ArrayList<Integer>> result = subsets(list);

		System.out.println(result.toString());
	}
}