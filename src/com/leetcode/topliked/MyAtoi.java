package com.leetcode.topliked;

public class MyAtoi {
	public int myAtoi(String str) {
		str = str.trim();
		if (str.isEmpty()) {
			return 0;
		}
		char ch = str.charAt(0);
		int sign = 1;
		int index = 0;
		if (ch == '+') {
			index++;
		} else if (ch == '-') {
			sign = -1;
			index++;
		}
		int t = 0;
		while (index < str.length() && Character.isDigit(str.charAt(index))) {
			int d = str.charAt(index) - '0';
			if (t > (Integer.MAX_VALUE - d) / 10) {
				return sign == -1 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
			}
			t = t * 10 + d;
			index++;
		}
		return t * sign;
	}

	public static void main(String[] args) {
		MyAtoi thisClass = new MyAtoi();
		System.out.println(thisClass.myAtoi("+"));

	}

}
