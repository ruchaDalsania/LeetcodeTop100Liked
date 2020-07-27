package com.leetcode.topliked;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

//	public List<String> fizzBuzz(int n) {
//
//		List<String> output = new ArrayList<String>();
//		for (int i = 1; i <= n; i++) {
//			if (i % 3 == 0 && i % 5 == 0) {
//				output.add("FizzBuzz");
//			} else if (i % 3 == 0) {
//				output.add("Fizz");
//			} else if (i % 5 == 0) {
//				output.add("Buzz");
//			} else
//				output.add(Integer.toString(i));
//		}
//		return output;
//	}
	private static final String FIZZ = "Fizz";
	private static final String BUZZ = "Buzz";

	public List<String> fizzBuzz(int n) {

		return (List<String>) new java.util.AbstractList<String>() {
			public String get(int i) {
				i += 1;
				if (i % 3 == 0 && i % 5 == 0)
					return FIZZ + BUZZ;
				if (i % 3 == 0)
					return FIZZ;
				if (i % 5 == 0)
					return BUZZ;
				return String.valueOf(i);
			}

			public int size() {
				return n;
			}
		};
	}

	public static void main(String[] args) {
		FizzBuzz thisClass = new FizzBuzz();
		System.out.println(thisClass.fizzBuzz(20));

	}

}
