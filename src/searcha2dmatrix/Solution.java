package searcha2dmatrix;

public class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        boolean res = false;
        if(matrix==null)return false;
        int i=0,j=matrix[0].length-1;
        while(i<matrix.length && j>=0){
        	System.out.println(i + ".." + j);
            if(target < matrix[i][j]){
                j--;
            }else if(target > matrix[i][j]){
                i++;
            }else{
                res = true;
                break;
            }
        }
        return res;
    }
    
    public static void main(String args[]){
    	Solution s = new Solution();
    	int[][] a = new int[][]{{1,1}};
    	
    	System.out.println(s.searchMatrix(a, 1));
    }
}
