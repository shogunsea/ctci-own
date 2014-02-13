package Own;
public class CountCompression{

	public static String compress(String s){
		int count = 1;
		StringBuffer sb = new StringBuffer();

		for(int i = 1; i<s.length(); i++){
			if(s.charAt(i)==s.charAt(i-1)){
				count++;
				continue;
			}else{
				sb.append(s.charAt(i-1));
				sb.append(count);
				count = 1;
			}
		}
		sb.append(s.charAt(s.length()-1));
		sb.append(count);

		return sb.toString();
	}

	public static void main(String[] args){
		String str = "abbccccccde";
		String result = compress(str);

		System.out.println(str);
		System.out.println(result);
	}
}