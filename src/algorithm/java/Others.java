package algorithm.java;


public class Others{
	/**
	 * leetcode #7
	 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数
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
	
	
	/**
	 * leetcode #13
	 * 罗马数字转整数
	 * 
	 */
	public static int romanToInt(String s) {
		return 0;
	}
}