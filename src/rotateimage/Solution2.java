package rotateimage;

public class Solution2 {
	public void rotate(int[][] matrix){
		int n = matrix.length;
		for(int i = 0; i < n/2; i++){
			//数组上下翻转
			int[] p = matrix[i];
			matrix[i] = matrix[n-1-i];
			matrix[n-1-i] = p;
		}
		for(int i = 0; i<n; i++){
			for(int j = i+1; j<n; j++){
				int temp = matrix[i][j];
				matrix[i][j] = matrix[j][i];
				matrix[j][i] = temp;
			}
		}
	}
	public static void main(String[] args) {
		Solution2 s2 = new Solution2();
		int[][] m = {{1,2,3},{4,5,6}, {7,8,9}};
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m.length; j++){
				System.out.print(m[i][j]+",");
			}
			System.out.println();
		}
		System.out.println("------");
		s2.rotate(m);
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m.length; j++){
				System.out.print(m[i][j]+",");
			}
			System.out.println();
		}
	}

}
