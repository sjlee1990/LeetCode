package happynumber;

import java.util.HashSet;
import java.util.Set;

public class Solution {
	public boolean isHappy(int n){
		Set<Integer> s = new HashSet<Integer>();
		while(n != 1){
			if(s.contains(n))return false;
			s.add(n);
			n = replaceNumber(n);
		}
		return true;
	}
	public int replaceNumber(int n){
		int num = 0;
		while(n != 0){
			num += (int)Math.pow(n%10, 2);
			n /= 10;
		}
		return num;
	}
	
	public static void main(String[] args) {
		Solution s = new Solution();
		System.out.println(s.replaceNumber(37));
		System.out.println(s.isHappy(19));
	}
}
