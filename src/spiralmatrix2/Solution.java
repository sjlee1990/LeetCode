package spiralmatrix2;

public class Solution {
	public int[][] generateMatrix(int n){
		if(n<0) return null;
		int[][] m = new int[n][n];
		int num = 1;
		int xstart = 0, xend = n-1;
		int ystart = 0, yend = n-1;
		while(n>xstart*2 && n>ystart*2){
			for(int i=xstart; i<=xend; i++){
				m[ystart][i] = num;
				num++;
			}
			ystart++;
			for(int i=ystart; i<=yend && xstart<=xend; i++){
				m[i][xend] = num;
				num++;
			}
			xend--;
			for(int i=xend; i>=xstart && ystart<=yend; i--){
				m[yend][i] = num;
				num++;
			}
			yend--;
			for(int i=yend; i>=ystart && xstart<=xend; i--){
				m[i][xstart] = num;
				num++;
			}
			xstart++;
		}
		return m;
	}
}
