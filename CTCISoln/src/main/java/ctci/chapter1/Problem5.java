package ctci.chapter1;

public class Problem5 {
	public static void main(String[] args) {
		Problem5 obj=new Problem5();
		System.out.println(obj.isOneEditAway("pale", "ple"));
		System.out.println(obj.isOneEditAway("pales", "pale"));
		System.out.println(obj.isOneEditAway("pale", "bale"));
		System.out.println(obj.isOneEditAway("pale", "bake"));
	}
public boolean isOneEditAway(String s, String t){
	if(Math.abs(s.length()-t.length())>1)
		return false;
	int changesCount=0;
	int i=0,j=0;
	while(i<s.length() && j<t.length()){
		if(s.charAt(i)==t.charAt(j))
		{
			i++;
			j++;
		}
		else
		{
			changesCount++;
			i=s.length()>=t.length()?i+1:i;
			j=s.length()<=t.length()?j+1:j;	
			if(changesCount>1)
				return false;
		}
	}
	if((i<s.length() || j<t.length()))
		changesCount++;
	return changesCount<=1;
}
}
