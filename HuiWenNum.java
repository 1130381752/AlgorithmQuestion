package test;

import java.util.ArrayList;

/**
 * 编号：LC 9
 * 难度：简单
 * 回文数：回文数是指正序（从左往右）和倒序（从右往左）读都是一样的整数，判断一个数是否为回文数。
 * @author hWX5322377
 *
 */

public class HuiWenNum {
	public static void main(String[] args) {
		Utils.println(isHuiWenNum(-121));
		Utils.println(isHuiWenNum(100));
		Utils.println(isHuiWenNum(1));
		Utils.println(isHuiWenNum(121));
		Utils.println(isHuiWenNum(1221));
	}
	
	//非字符串方法
	public static boolean isHuiWenNum(int num) {
		if (num > 0) {
			if (num < 10) {
				return true;
			} else {
				ArrayList<Integer> ints = new ArrayList<Integer>();
				int temp = num;
				int len = 1;
				while (temp >= 10) {
					temp = temp / 10;
					len++;
				}
				int res = num;
				for (int i = 0; i < len - 1; i++) {
					ints.add(res % 10);
					res = res / 10;
					if (res < 10) {
						ints.add(res);
					}
				}
				int halfLen = len / 2;
				for (int i = 0; i < halfLen; i++) {
					if (ints.get(i) != ints.get(len - 1 - i)) {
						return false;
					}
				}
				return true;
			}
		}
		return false;
	}
	
	//字符串方法
	public static boolean isHuiWenNumStr(int num) {
		if (num > 0) {
			String str = String.valueOf(num);
			String str1 = "";
			String str2 = "";
			String temp = "";
			if (str.length() == 1) {
				return true;
			}
			int len = str.length();
			int halfLen = len / 2;
			str1 = str.substring(0, halfLen);
			temp = str.substring(len - halfLen, len);
			for (int i = temp.length() - 1; i >= 0; i--) {
				str2 += temp.charAt(i);
			}
			return str1.equals(str2);
		}
		return false;
	}
}
