package test;

/**
 * 编号：14
 * 难度：简单
 * 最长公共前缀：编写一个函数来查找字符串数组中的最长公共前缀，如果不存在公共前缀返回 ""。
 * @author hWX5322377
 *
 */

public class LongestCommonPrefix {
	public static void main(String[] args) {
		Utils.println(getLongestCommonPrefix(new String[] {"flower", "flow", "flight"}));
		Utils.println(getLongestCommonPrefix(new String[] {"dog", "racecar", "car"}));
	}
	
	public static String getLongestCommonPrefix(String[] strs) {
		int index = 0;
		int minLen = strs[0].length();
		for (int i = 1; i < strs.length; i++) {
			if (strs[i].length() < minLen) {
				index = i;
				minLen = strs[i].length();
			}
		}
		int maxCommonIndex = 0;
		for (int i = 0; i < minLen; i++) {
			String checkStr = strs[index].substring(0, i + 1);
			int num = 0;
			for (int j = 0; j < strs.length; j++) {
				if (j != index) {
					if (strs[j].startsWith(checkStr)) {
						if (num == strs.length -1 -1) {
							maxCommonIndex++;
							continue;
						}
						num++;
					} else {
						return "最长公共前缀："+ (maxCommonIndex == 0? "\"\"":strs[index].substring(0, maxCommonIndex));
					}
				}
			}
		}
		return "最长公共前缀：\"\"";
	}
}
