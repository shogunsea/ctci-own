package Own;
import java.util.HashMap;
import java.util.Arrays;
public class Anagrams{
	public static boolean isAnagrams(String[] s){
		String s1 = s[0];
		String s2 = s[1];
		if(s1.length()!=s2.length()){
			return false;
		}
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();

		for(int i = 0; i<s1.length(); i++){
			char tempChar = s1.charAt(i);
			if(map.containsKey(tempChar)){
				map.put(tempChar,map.get(tempChar)+1);
			}else{
				map.put(tempChar, 1);
			}
		}
		for(int i =0; i<s2.length(); i++){
			char tempChar = s2.charAt(i);
			if(!map.containsKey(tempChar)){
				return false;
			}else if(map.get(tempChar)-1<0){
				return false;
			}
			map.put(tempChar, map.get(tempChar)-1);
		}
		return true;

	}

	public static boolean	isAnagrams2(String[] s){
		char[] s1 = s[0].toCharArray();
		char[] s2 = s[1].toCharArray();
		if(s1.length!=s2.length){
			return false;
		}

		Arrays.sort(s1);
		Arrays.sort(s2);
		for(int i = 0; i<s1.length; i++){
			if(s1[i]!=s2[i]){
				return false;
			}
		}
		return true;
	}
	
	public static boolean isAnagrams3(String[] s){
		String s1 = s[0];
		String s2 = s[1];
		if(s1.length()!=s2.length()){
			return false;
		}
		int[] count = new int[256];

		for(int i = 0; i<s1.length(); i++){
			int val = (int)(s1.charAt(i)-'a');
			count[val]++;
		}

		for(int i = 0; i<s2.length(); i++){
			int val = (int)(s2.charAt(i)-'a');
			if(count[val]==0){
				return false;
			}else if(count[val]-1<0){
				return false;
			}
			count[val]--;
		}
		return true;
	}


	public static void main(String[] args){
		String[] s1 = {"apple", "papel"};
		String[] s2 = {"carrot", "tarroc"};
		String[] s3 = {"hello", "leloh"};

		System.out.println(isAnagrams(s1));
		System.out.println(isAnagrams(s2));
		System.out.println(isAnagrams(s3));
		System.out.println(isAnagrams2(s1));
		System.out.println(isAnagrams2(s2));
		System.out.println(isAnagrams2(s3));
		System.out.println(isAnagrams3(s1));
		System.out.println(isAnagrams3(s2));
		System.out.println(isAnagrams3(s3));

	}
}