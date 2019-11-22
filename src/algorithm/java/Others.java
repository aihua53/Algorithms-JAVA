package algorithm.java;

import java.util.HashMap;

public class Others{
	/**
	 * leetcode #7
	 * �ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ��������
	 */
	public static boolean isPalindrome_1(int x) {
		String str1 = Integer.toString(x);
		int len = str1.length();
		for(int i=0;i<str1.length()/2;i++) {
			if(str1.charAt(i) != str1.charAt(len-1-i)) {
				return false;
			}
			
		}
		return true;
	}
	
	public static boolean isPalindrome_2(int x) {
		String str1 = Integer.toString(x);
		StringBuffer sBuffer = new StringBuffer(str1);
		sBuffer.reverse();
		System.out.println(sBuffer);
		System.out.println("str1="+str1);
		return sBuffer.toString().equals(str1);
	}
	
}