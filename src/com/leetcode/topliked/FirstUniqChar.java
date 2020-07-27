package com.leetcode.topliked;

public class FirstUniqChar {
	public int firstUniqChar(String s) {
		int[] arr = new int[26];
		for (char c : s.toCharArray()) {
			arr[c - 'a']++;
		}
		for (int i = 0; i < s.length(); i++) {
			if (arr[s.charAt(i) - 'a'] == 1) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		FirstUniqChar thisClass = new FirstUniqChar();
		System.out.println(thisClass.firstUniqChar("loveleetcode"));

	}

}
