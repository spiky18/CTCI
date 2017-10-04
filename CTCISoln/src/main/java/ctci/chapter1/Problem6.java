package ctci.chapter1;

public class Problem6 {
	
	
	public static void main(String[] args) {
		Problem6 obj= new Problem6();
		System.out.println(obj.compression("abc"));
		System.out.println(obj.compression(""));
		System.out.println(obj.compression("aabcccccaaa"));
	}

	public String compression(String s){
		if(s.isEmpty())
			return s;
		StringBuilder sb= new StringBuilder();
		int currCount=1;
		sb.append(s.charAt(0));
		for(int i=1;i<s.length();i++){
			if(s.charAt(i-1)==s.charAt(i))
				currCount++;
			else{
				sb.append(currCount);
				sb.append(s.charAt(i));
				currCount=1;
			}
		}
		sb.append(currCount);
		
		return sb.toString().length()<s.length()?sb.toString():s;
	}
}
