package test;

/**
 * 编号：LC 13
 * 难度：简单
 * 罗马数字转整数：罗马数字包含以下七种字符：I、V、X、L、C、D、M
 * 
 * I ---> 1
 * V ---> 5
 * X ---> 10
 * L ---> 50
 * C ---> 100
 * D ---> 500
 * M ---> 1000
 * 
   * 如果左边的数字的值比右边的小，则用右边的减左边，如IV代表4（5-1），但这种排列只有以下几种情况：
 * IV ---> 4
 * IX ---> 9
 * XL ---> 40
 * XC ---> 90
 * CD ---> 400
 * CM ---> 900
 * 
 * @author hWX5322377
 *
 */

public class RomanNum {
	public static void main(String[] args) {
		Utils.println(readRomanNum("III"));
		Utils.println(readRomanNum("IV"));
		Utils.println(readRomanNum("IX"));
		Utils.println(readRomanNum("LVIII"));
		Utils.println(readRomanNum("MCMXCIV"));
	}
	
	public static int readRomanNum(String str) {
		int pre = 0;
		int next = 0;
		int halfLen = str.length() / 2;
		if (halfLen == 0) {
			return getValue(str.charAt(0));
		}
		int sum = getValue(str.charAt(str.length() - 1));
		for (int i = 0; i < str.length() - 1; i++) {
			pre = getValue(str.charAt(i));
			next = getValue(str.charAt(i + 1));
			if (pre < next) {
				sum -= pre;
			} else {
				sum += pre;
			}
		}
		return sum;
	}
	
	public static int getValue(char s) {
		int res = 0;
		switch (s) {
		case 'I':
			res = 1;
			break;
		case 'V':
			res = 5;
			break;
		case 'X':
			res = 10;
			break;
		case 'L':
			res = 50;
			break;
		case 'C':
			res = 100;
			break;
		case 'D':
			res = 500;
			break;
		case 'M':
			res = 1000;
			break;
		}
		return res;
	}
}
