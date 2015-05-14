package containerwithmostwater;

public class Solution {
	public int maxArea(int[] height){
		int i = 0, j = height.length-1;
		int maxArea = 0;
		while(i < j){
			int A = (j - i)*Math.min(height[i], height[j]);
			maxArea = Math.max(A, maxArea);
			if(height[i] <= height[j]){
				i++;
			}else{
				j--;
			}
		}
		return maxArea;
	}
	public static void main(String[] args){
		int[] a = {5,4,3,2,1};
		Solution s = new Solution();
		System.out.println(s.maxArea(a));
	}
	
}
