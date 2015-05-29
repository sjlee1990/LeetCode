package spiralmatrix;

import java.util.ArrayList;
import java.util.List;

public class Solution {
	public List<Integer> spiralOrder(int[][] matrix){
		if(matrix  == null)return null;
		if(matrix.length == 0)return new ArrayList<Integer>();
		int m = matrix.length;
		int n = matrix[0].length;
		List<Integer> soList = new ArrayList<Integer>();
		int xstart = 0, xend = n-1;
		int ystart = 0, yend = m-1;
		while(n>xstart*2 && m>ystart*2){//循环条件
			//第一步,至少要走第一步，后面都三步都需要判断
			for(int i=xstart; i<=xend; i++){
				soList.add(matrix[ystart][i]);
			}
			ystart++;
			//第二步
			if(xstart <= xend){//每个数组只有一个元素的情况
				for(int i=ystart; i<=yend; i++){
					soList.add(matrix[i][xend]);
				}
				xend--;
			}
			//第三步
			if(ystart <= yend){
				for(int i=xend; i>=xstart; i--){
					soList.add(matrix[yend][i]);
				}
				yend--;
			}
			//第四步
			if(xstart <= xend){
				for(int i=yend; i>=ystart; i--){
					soList.add(matrix[i][xstart]);
				}
				xstart++;	
			}
		}		
		return soList;
	}
	
	public static void main(String[] args){
		Solution s = new Solution();
		int[][] m = {{1},{2},{3},{4},{5},{6}};
		System.out.println(s.spiralOrder(m));
	}
}
