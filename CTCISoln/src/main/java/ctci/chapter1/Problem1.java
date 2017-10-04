package ctci.chapter1;

public class Problem1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Problem1 obj=new Problem1();
		String s="zhghdbnal";
		System.out.println(obj.isUniqueCharacter("Hello"));
		//obj.quicksort(sArr, 0, s.length()-1);
		System.out.println(obj.isUniqueCharacterII(s));

	}

	//Constant Space Complexity. Time Complexity O(n)
	public boolean isUniqueCharacter(String s){
		boolean[] charArr=new boolean[256];
		for(char ch : s.toCharArray()){
			if(charArr[ch])
				return false;
			charArr[ch]=true;
		}
		return true;
	}
	//Solution without using  extra space 
	public boolean isUniqueCharacterII(String s){
		char[] arr=s.toCharArray();
		quicksort(arr, 0, s.length()-1);
		for(int i=1;i<s.length();i++){
			if(arr[i-1]==arr[i])
				return false;
		}
		return true;
	}
	
	public void quicksort(char[] arr,int start,int end){
		if(start>end)
			return;
		int p=partition(arr, start, end);
		quicksort(arr, start, p-1);
		quicksort(arr, p+1, end);
	}
	
	public int partition(char[] arr,int start,int end){
		char pivot=arr[end];
		int i=start-1;
		for(int j=start;j<end;j++)
		{
			if(arr[j]<pivot){
				i++;
				char tmp=arr[i];
				arr[i]=arr[j];
				arr[j]=tmp;
			}
			
		}
		i++;
		arr[end]=arr[i];
		arr[i]=pivot;
		return i;
		
	} 
	
}
