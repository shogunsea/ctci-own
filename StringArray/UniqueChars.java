package Own;
import java.util.HashMap;
public class UniqueChars{

	public static boolean isUnique(String str) {
		if (str.length() > 256) {
			return false;
		}
		int checker = 0;
		for (int i = 0; i < str.length(); i++) {
			int val = str.charAt(i) - 'a';
			if ((checker & (1 << val)) > 0) return false;
			checker |= (1 << val);
		}
		return true;
	}
	
	public static boolean isUnique2(String s){
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i<s.length(); i++){
			if(map.containsKey(s.charAt(i))){
				return false;
			}
			map.put(s.charAt(i),1);
		}
		return true;
	}
	public static boolean isUnique3(String s){
		int checker = 0;
		for(int i = 0; i<s.length(); i++){
			int val = (int)(s.charAt(i)-'a');
			if((checker&(1<<val))!=0){
				return false;
			}
			checker|=(1<<val);
		}
		return true;
	}

	public static void main(String[] args){
		String s1 = "abdsa";
		String s2 = "asdjflksjdfojf";

		System.out.println(isUnique(s1));
		System.out.println(isUnique2(s1));
		System.out.println(isUnique3(s1));
		System.out.println(isUnique(s2));
		System.out.println(isUnique2(s2));
		System.out.println(isUnique3(s2));
	}

}