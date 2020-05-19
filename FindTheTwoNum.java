package test;

/**
 * 编号：1
 * 难度：简单
 * 二数之和：给定一个整数数组和一个目标值，求出该数组中和等于目标值的那2个数的下标。
 * @author hWX5322377
 *
 */

public class FindTheTwoNum {
	public static void main(String[] args) {
		int[] res = twoNum(new int[] {1, 2, 5, 3}, 7); 
		Utils.println(res[0]);
		Utils.println(res[1]);
	}
	
	public static int[] twoNum(int [] nums, int sum) {
		int[] twoNum = new int[2];
		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (sum == nums[j] + nums[i]) {
					twoNum[0] = i;
					twoNum[1] = j;
					return twoNum;
				}
			}
		}
		throw new RuntimeException("无法找到！");
	}
}
