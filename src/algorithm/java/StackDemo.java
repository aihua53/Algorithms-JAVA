package algorithm.java;

import java.util.*;

public class StackDemo{

	//leetcode #7 整数反转
	/*
	 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
	 */
	public static int reverse_1(int x) {
		String str1 = Integer.toString(x);
		char[] c = str1.toCharArray();
		Stack<Character> s = new Stack();
		
		if(c[0] == '-') {
			for(int i =1;i<c.length;i++) {
				s.push(c[i]);
			}
			for(int i =1;i<c.length;i++) {
				c[i] = s.pop();
			}	
		}else {
			for(int i =0;i<c.length;i++) {
				s.push(c[i]);
			}
			for(int i =0;i<c.length;i++) {
				c[i] = s.pop();
			}	
		}
		String str2 = new String(c);
		return Integer.valueOf(str2);
	}
	
	public static int reverse_2(int x) {
		String str1 = Integer.toString(x);
		char[] c1 = str1.toCharArray();
		char[] c2 = new char[c1.length];

		if(c1[0] == '-') {
			c2[0] = c1[0];
			for(int k=1;k<c1.length;k++) {
				c2[c1.length-k] = c1[k];
			}
		}else {
			for(int k=0;k<c1.length;k++) {
				c2[c1.length-k-1] = c1[k];
			}
		}
		String str2 = new String(c2);
		return Integer.valueOf(str2);
	}
	
	
}