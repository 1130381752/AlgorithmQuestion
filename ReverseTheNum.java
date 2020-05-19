package test;

/**
 * 编号：7
 * 难度：简单
 * 整数反转：给出一个32位的有符号整数，将该整数上每个数字进行反转。
 * @author hWX5322377
 *
 */

public class ReverseTheNum {
	public static void main(String[] args) {
		Utils.println(reverseNum(-12345));
	}
	
	public static String reverseNum(int num) {
		String res = "";
		int index = 0;
		String temp = String.valueOf(num);
		if (temp.startsWith("-") || temp.startsWith("+")) {
			res = temp.substring(0, 1);
			index = 1;
		}
		for(int i = temp.length() - 1; i >= index; i--) {
			res += temp.charAt(i);
		}
		return res;
	}
}
