package ctci.chapter1;

public class Problem3 {

	public static void main(String[] args) {
		Problem3 obj= new Problem3();
		System.out.println(obj.URLify("I am Himanshu Vyas      ", 18));
	}
	public String URLify(String s,int actLen){
		char[] arr=s.toCharArray();
		int i=s.length()-1;
		while(actLen>0){
			if(arr[actLen-1]!=' ')
			{
				char tmp=arr[i];
				arr[i]=arr[actLen-1];
				arr[actLen-1]=tmp;
				i--;
			}
			else
			{
				arr[i--]='0';
				arr[i--]='2';
				arr[i--]='%';
				//i=i-3;
			}
			
			actLen--;
		}
		return String.valueOf(arr);
	}
}
