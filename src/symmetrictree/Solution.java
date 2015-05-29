package symmetrictree;

import aEntities.TreeNode;
//2015-5-29
public class Solution {
	public boolean isSymmetric(TreeNode root){
		if(root!=null)return isMirror(root.left, root.right);
		return true;
	}
	public boolean isMirror(TreeNode rt1, TreeNode rt2){
		boolean res = true;
		if((rt1==null && rt2!=null) || (rt1!=null&&rt2==null))return false;
		if(rt1 != null && rt2 != null){
			if(rt1.val != rt2.val)return false;
			res = isMirror(rt1.left, rt2.right) && isMirror(rt1.right, rt2.left);
		}
		return res;
		
	}
	public static void main(String[] args) {
		
	}

}
