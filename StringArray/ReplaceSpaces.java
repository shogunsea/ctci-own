package Own;
// replace spaces in a string by '%20' 
public class ReplaceSpaces{

	public static String replace(String s){
		int len = s.length();
		int spaceCount = countSpace(s);
		int newLength = len+spaceCount*2+1;// last char should be '\0'
		char[] str = new char[newLength];
		str[newLength-1] = '\0';

		for(int i = 0; i<s.length(); i++){
			str[i] = s.charAt(i);
		}

		int j = len-1;// old string index
		for(int i = newLength-2; i>=0; i--){
			if(j>=0){
				if(str[j]==' '){
					str[i--] = '0';
					str[i--] = '2';
					str[i] = '%';
				}else{
					str[i] = str[j];
				}
				j--;
			}
		}

		return new String(str);
	}

	public static int countSpace(String s){
		int result = 0;
		for(int i = 0; i<s.length(); i++){
			if(s.charAt(i)==' '){
				result++;
			}
		}
		return result;
	}

	public static void main(String[] args){
		String s1 = "ab c d e f  8 9 k i u y h k";
		System.out.println("Original String: "+s1);
		String s2 = replace(s1);
		System.out.println("After replacing: "+s2);
	}
}