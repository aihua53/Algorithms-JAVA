package algorithm.java;

import java.util.Vector;

public class Array {
	public static int[] plusOne(int[] digits) {
		int l = digits.length;
		boolean flag = true;
		for(int i = 1;i<=l;i++) {
			if(flag == true) {
				if(digits[l-i] < 9) {
					digits[l-i] = digits[l-i] +1;
					flag = false;
				}else {
					digits[l-i] = 0;
					flag = true;
				}
			}	
		}
		
		if(flag == true) {
			int [] value = new int[l+1];
			value[0] = 1;
			return value;
		}else {
			return digits;
		}
	}

	public static int[] plusOne_1(int[] digits) {
		int l = digits.length;
		boolean flag = true;
		int i = 1;
		while(flag == true) {
			if(i<=l) {
				if(digits[l-i] == 9) {
					digits[l-i] = 0;
					i++;
				}else {
					digits[l-i] = digits[l-i]+1;
					flag = false;
					break;
				}
			}else {
				break;
			}

		}
		if(flag == true) {
			int [] value = new int[l+1];
			value[0] = 1;
			return value;
		}
		return digits;
	}


	public static int removeDuplicates(int[] nums) {
		return removeFirstDuplicate(nums,nums.length);
    }

	public static int removeFirstDuplicate(int[]nums,int length) {
		for(int i=0;i<length-1;i++) {
			if(nums[i] == nums[i+1]) {
				for(int j=i;j<length-1;j++) {
					nums[j] = nums[j+1];
				}
				length--;
				length = removeFirstDuplicate(nums,length);
				break;
			}
		}
		return length;
	}

	public static int removeDuplicates_2(int[] nums) {
		int i = 0;
		for(int j=1;j<nums.length;j++) {
			if(nums[i] != nums[j]) {
				i++;
				nums[i] = nums[j];
			}
		}
		return i+1;
	}

	public static void moveZeroes(int[] a) {
		int count = 0;
		for(int i=0;i<a.length;i++) {
			if(a[i] == 0) {
				count++;
			}else {
				a[i-count] = a[i];
			}
		}
		for(int i=0;i<count;i++) {
			a[a.length-1-i] = 0;
		}
	}

	//leetcode 11
	public static int maxArea(int[] height) {
		int maxArea = 0;
		int i =0;
		int j = height.length - 1;
		while(i != j) {
			maxArea = Math.max(maxArea, (j-i)*Math.min(height[i], height[j]));
			if(height[i] < height[j]) {
				i++;
			}else {
				j--;
			}
		}
		return maxArea;
	}

	//leetcode 70
	public static int climbStairs(int n) {
		int[] a = new int[n+1];
		a[0] = 1;
		a[1] = 1;
		for(int i = 2;i<=n;i++) {
			a[i] = a[i-1] + a[i-2];
		}
		return a[n];
	}


}
