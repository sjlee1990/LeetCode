package permutations;

import java.util.ArrayList;
//import java.util.Arrays;
import java.util.List;

public class Solution {
	public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutations =new ArrayList<List<Integer>>();
        if(nums == null || nums.length == 0){
        	return null;
        }else if(nums.length == 1){
        	List<Integer> arrayToList = new ArrayList<Integer>();
        	arrayToList.add(nums[0]);
            permutations.add(arrayToList);
            //permutations.add(new ArrayList<Integer>(Arrays.asList(nums[0])));
        }else{        
	        for(int i = 0; i < nums.length; i++){
	            for(List<Integer> l : permute(resetNums(nums,nums[i]))){
	                l.add(nums[i]);
	                permutations.add(l);   
	            }
	        }
        }
        return permutations;
    }
    
    public int[] resetNums(int[] nums, int x){
        int[] rn = new int[nums.length-1];
        for(int i = 0, j = 0; i < nums.length; i++){
            if(nums[i] != x){
                rn[j] = nums[i];
                j++;
            }
        }
        return rn;
    }
    public static void main(String[] args){
    	int[] a = {1,2,3};
    	Solution s = new Solution();
    	List<List<Integer>> l = s.permute(a);
    	for (List<Integer> list : l) {
			System.out.println(list);
		}
    }
}
