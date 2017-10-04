package ctci.chapter1;

import java.util.HashMap;
import java.util.Map;

public class Problem4 {
	public static void main(String[] args) {
		Problem4 obj=new Problem4();
		System.out.println(obj.isPalindromePermutation("taco cat"));
	}
	
	public boolean isPalindromePermutation(String s){
		Map<Character,Integer> map=new HashMap<Character, Integer>();
		for(char ch : s.toCharArray()){
			if(Character.isLetterOrDigit(ch)){
			if(map.containsKey(ch))
				map.put(ch, map.get(ch)+1);
			else
				map.put(ch, 1);
			}
		}
		boolean isOdd=false;
		for(char ch : map.keySet()){
			if(map.get(ch)%2!=0){
				if(!isOdd)
					isOdd=true;
				else
					return false;
			}
		}
		return true;
	}
}
