package test;

import java.util.Comparator;
import java.util.LinkedList;

/**
 * 编号：21
 * 难度：简单
 * 合并2个有序链表：将2个升序链表合并成1个新的升序链表并返回，不需要去重。
 * @author hWX5322377
 *
 */

public class CombineTwoLinkedList {
	public static void main(String[] args) {
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(2);
		list1.add(4);
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		list1.add(1);
		list1.add(3);
		list1.add(4);
		combineLinkedList(list1, list2);
	}
	
	public static void combineLinkedList(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		list1.addAll(list2);
		list1.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer arg0, Integer arg1) {
				return arg0 - arg1;
			}
		});
		for (int i = 0; i < list1.size(); i++) {
			Utils.println(list1.get(i));
		}
	}
}
