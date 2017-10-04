package ctci.chapter1;

public class Problem7 {
	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		int cnt = 1;
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				matrix[i][j] = cnt;
				cnt++;
			}
		}
		Problem7 obj=new Problem7();
		System.out.println("Before Rotation");
		obj.printMatrix(matrix);
		System.out.println("After rotation");
		matrix=obj.matrixRotation(matrix);
		obj.printMatrix(matrix);
		System.out.println(matrix[2][0]);
	}

	public int[][] matrixRotation(int[][] m) {
		if (m.length == 0 || m.length != m[0].length)
			return m;
		int[][] rm = new int[m.length][m.length];
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++)
				rm[i][j] = m[j][m.length - 1 -i];
		}
		return rm;
	}

	public void printMatrix(int[][] m) {
		for (int i = 0; i < m.length; i++) {
			for (int j = 0; j < m.length; j++)
				System.out.print(m[i][j] + " ");
			System.out.println();
		}
	}
}
