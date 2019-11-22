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

	/**
	 * leetcode #13
	 * ��������ת����
	 *
	 */
	public static int romanToInt(String s) {
		int value = 0;
		String temp = null;
		HashMap<String,Integer> hMap = new HashMap<String,Integer>();
		hMap.put("I", 1);
		hMap.put("V", 5);
		hMap.put("X", 10);
		hMap.put("L", 50);
		hMap.put("C", 100);
		hMap.put("D", 500);
		hMap.put("M", 1000);
		hMap.put("IV", 4);
		hMap.put("IX", 9);
		hMap.put("XL", 40);
		hMap.put("XC", 90);
		hMap.put("CD", 400);
		hMap.put("CM", 900);
		for(int i=0;i<s.length();i++) {
			if(i+1<s.length()) {
				temp = s.substring(i, i+2);
				//System.out.println(temp);
				if(hMap.get(temp) != null)
				{
					value += hMap.get(temp);
					i++;
				}else {
					temp = s.substring(i, i+1);
					if(hMap.get(temp)!=null) {
						System.out.println(temp);
						value += hMap.get(temp);
					}
				}
			}else {
				temp = s.substring(i, i+1);
				if(hMap.get(temp)!=null) {
					System.out.println(temp);
					value += hMap.get(temp);
				}
			}
		}
		return value;
	}
}
