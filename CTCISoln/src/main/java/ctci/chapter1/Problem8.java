package ctci.chapter1;

import java.util.HashSet;

public class Problem8 {
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		int cnt = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrix[i][j] = cnt;
				cnt++;
			}
		}
		Problem7 obj1=new Problem7();
		//System.out.println("Before Rotation");
		obj1.printMatrix(matrix);
		
		matrix[0][2]=0;
		Problem8 obj2= new Problem8();
		matrix=obj2.setZeroesII(matrix);
		System.out.println("After Operation");
		obj1.printMatrix(matrix);
		//System.out.println("After rotation");
		//matrix=obj.matrixRotation(matrix);
		//obj.printMatrix(matrix);
		//System.out.println(matrix[2][0]);
	}
	
	public int[][] setZeroes(int[][] m) {
		HashSet<Integer> rows = new HashSet<Integer>();
		HashSet<Integer> cols = new HashSet<Integer>();
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				if(m[i][j]==0){
					rows.add(i);
					cols.add(j);
				}
			}
		}
		for(int r : rows){
			for(int i=0;i<m[0].length;i++)
				m[r][i]=0;
		}
		for(int c : cols){
			for(int i=0;i<m.length;i++)
				m[i][c]=0;
		}
		return m;
	}

	public int[][] setZeroesII(int[][] m) {
		for(int i=0;i<m.length;i++){
			for(int j=0;j<m[0].length;j++){
				if(m[i][j]==0){
					m[0][j]=0;
					m[i][0]=0;
				}
			}
		}
		for(int i=m.length-1;i>=0;i--){
			for(int j=m[0].length-1;j>=0;j--){
				if(m[0][j]==0 || m[i][0]==0)
					m[i][j]=0;
			}
			}
		return m;
	}

}
