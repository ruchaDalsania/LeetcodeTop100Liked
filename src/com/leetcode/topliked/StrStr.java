package com.leetcode.topliked;

public class StrStr {

	public int strStr(String haystack, String needle) {
		if (needle.length() == 0)
			return 0;
		for (int i = 0; i < haystack.length(); i++) {
			
			for (int j = 0; j < needle.length(); j++) {
				
				if (i + needle.length() > haystack.length()) {
					return -1;
				}
				if (haystack.charAt(i + j) != needle.charAt(j)) {
					break;
				}
				if (j == needle.length() - 1) {
					return i;
				}
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		StrStr thisClass = new StrStr();
		System.out.println(thisClass.strStr("fghgfhgf", "i"));

	}

}
