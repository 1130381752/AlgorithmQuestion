package test;

/**
 * 编号：27
 * 难度：简单
 * 移除元素：给定一个数组，你需要在原地删除等于指定值的元素，返回移除后数组的新长度。
 * 
 * 不要使用额外的数组空间，必须在原地修改输入数组，并在使用O(1)额外空间的条件下完成。
 * @author hWX5322377
 *
 */

public class RemoveSpecificArrayItem {
	public static void main(String[] args) {
		Utils.println(newLen(new int[] {3, 2, 1, 2, 3, 4, 1, 2, 1}, 4));
	}
	
	public static int newLen(int[] ints, int num) {
		if (ints.length > 0) {
			int i = 0;
			for (int j = 0; j < ints.length; j++) {
				if (ints[j] != num) {
					ints[i++] = ints[j];
				}
			}
			return i;
		}
		return 0;
	}
}
