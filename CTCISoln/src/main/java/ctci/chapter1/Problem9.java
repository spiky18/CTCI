package ctci.chapter1;

public class Problem9 {
	public static void main(String[] args) {
		Problem9 obj=new Problem9();
		System.out.println(obj.isStringRotation("waterbottle", "erbottlewat"));
	}
	
	public boolean isStringRotation(String s, String t){
		t=t+t;
		return t.indexOf(s)>-1; //indexOf(String) behaves as isSubstring Method
	}

}
