package ctci.chapter5;

public class Problem1 {
	
	public int insertMintoN(int m,int n,int i,int j){
		int k=1>>(j-i+1)-1;
		n<<=i;
		k<<=i;
		k^=Integer.MAX_VALUE;
		return (m&k)|n;
	}
	public static void main(String[] args) {
		int n=1024,m=19,i=2,j=6;
		Problem1 obj=new Problem1();
		System.out.println(obj.insertMintoN(n, m, i, j));
	}

}
