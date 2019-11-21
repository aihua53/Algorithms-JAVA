package algorithm.java;

import java.util.HashMap;
import java.util.Map;

public class HashTable{
	
	//leetcode #1  两数之和
	/*
	 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
	 */
	public static int[] twoSum(int[] nums, int target) {
		int[] result = new int[2];
		int t = 0;
		Map <Integer,Integer> hMap = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			hMap.put(nums[i],i);
			if(hMap.containsKey(target - nums[i])) {
				t = hMap.get(target - nums[i]);
				if(t != nums[i]) {
					result[1] = i;
					result[0] = hMap.get(target - nums[i]);
					break;
				}
				
			}
		}
		return result;
	}
}
