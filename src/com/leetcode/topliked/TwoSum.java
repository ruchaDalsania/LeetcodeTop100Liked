package com.leetcode.topliked;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {
		// Brute force approach
//		int[] arr = new int[2];
//		for (int i = 0; i < nums.length; i++) {
//			int j = i + 1;
//			while (j < nums.length) {
//				if (nums[i] + nums[j] == target) {
//					return new int[] { i, j };
//				} else {
//					j++;
//				}
//			}
//		}
//		return arr;

//		hashmap 6ms solution
		
//		Map<Integer, Integer> map = new HashMap<>();
//		for (int i = 0; i < nums.length; i++) {
//			map.put(nums[i], i);
//		}
//		for (int i = 0; i < nums.length; i++) {
//			int val = target - nums[i];
//			if (map.containsKey(val) && i != map.get(val)) {
//				return new int[] { i, map.get(val) };
//			}
//map.put(nums[i], i);
//		}

//		return null;

		Map<Integer, Integer> map = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			int complement = target - nums[i];
			if (map.containsKey(complement)) {
				return new int[] { map.get(complement), i };
			}
			map.put(nums[i], i);
		}
		throw new IllegalArgumentException("No two sum solution");
	}

	public static void main(String[] args) {
		TwoSum thisClass = new TwoSum();
		int[] nums = { 0, 4, -1, 0 };
		int target = 0;
		System.out.println(Arrays.toString(nums) + "\n" + target
				+ "\n indices of the two numbers such that they add up to a specific target.\n"
				+ Arrays.toString(thisClass.twoSum(nums, target)));

	}

}
