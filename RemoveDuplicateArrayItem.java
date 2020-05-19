package test;

/**
 * 编号：LC 26
 * 难度：简单
 * 删除排序数组中的重复项：给定一个排序数组，你需要在原地删除重复元素，使得每个元素仅出现一次，返回移除后数组的新长度。
 * 
 * 不要使用额外的数组空间，必须在原地修改输入数组，并在使用O(1)额外空间的条件下完成。
 * @author hWX5322377
 *
 */

public class RemoveDuplicateArrayItem {
	public static void main(String[] args) {
		Utils.println(newLen(new int[] {1, 1, 2}));
		Utils.println(newLen(new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4}));
	}
	
	public static int newLen(int[] ints) {
		if (ints.length > 0) {
			int i = 0;
			for (int j = 1; j < ints.length; j++) {
				if (ints[j] != ints[i]) {
					i++;
					ints[i] = ints[j];
				}
			}
			return i + 1;
		}
		return 0;
	}
}
