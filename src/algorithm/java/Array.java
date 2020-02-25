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

}
