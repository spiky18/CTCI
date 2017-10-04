package ctci.chapter1;

import java.util.HashMap;
import java.util.Map;

public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem2 obj= new Problem2();
		System.out.println(obj.isAnagram("abcdefghi", "ihgfbacde"));
		

	}

	public boolean isAnagram(String s, String t) {
		if(s.length()!=t.length())
			return false;
		Map<Character,Integer> frqMap=new HashMap<Character, Integer>();
		for(char ch : s.toCharArray()){
			if(frqMap.containsKey(ch)){
				frqMap.put(ch, frqMap.get(ch)+1);
			}
			else
				frqMap.put(ch, 1);
		}
		for(char ch :t.toCharArray()){
			if(frqMap.containsKey(ch)){
				int tmp=frqMap.get(ch);
				if(tmp-1>0)
					frqMap.put(ch, tmp-1);
				else
					frqMap.remove(ch);
			}
			else
				return false;
		}
		return frqMap.isEmpty();
	}
}
