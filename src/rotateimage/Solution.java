package rotateimage;

public class Solution {
	//空间复杂度 O(n*n)
	public void rotate(int[][] matrix){
		int n = matrix.length;
		int[][] clone = new int[n][n];
		for(int i = 0; i<n; i++){
			for(int j=0; j< n; j++){
				clone[i][j] = matrix[i][j];
			}
		}
		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				matrix[j][n-1-i] = clone[i][j];
			}
		}
	}
	public static void main(String[] args) {
		Solution s = new Solution();
		int[][] m = {{1,2,3},{4,5,6}, {7,8,9}};
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m.length; j++){
				System.out.print(m[i][j]+",");
			}
			System.out.println();
		}
		System.out.println("------");
		s.rotate(m);
		for(int i = 0; i < m.length; i++){
			for(int j = 0; j < m.length; j++){
				System.out.print(m[i][j]+",");
			}
			System.out.println();
		}
	}

}
