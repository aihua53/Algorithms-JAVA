package algorithm.java;

public class Array {
	public static int[] plusOne(int[] digits) {
		int l = digits.length;
		boolean flag = true;
		for(int i = 1;i<=l;i++) {
			if(flag == true) {
				if(digits[l-i] < 9) {
					digits[l-i] = digits[l-i] +1;
					flag = false;
				}else {
					digits[l-i] = 0;
					flag = true;
				}
			}	
		}
		
		if(flag == true) {
			int [] value = new int[l+1];
			value[0] = 1;
			return value;
		}else {
			return digits;
		}
	}

}
