package test;

import java.util.Stack;

/**
 * 编号：155
 * 难度：简单
 * 最小栈：设计1个支持push、pop、top操作，并能在常数时间内检索到最小元素的栈。
 * 
 * push(x) ———— 将整数元素x推入栈中
 * pop()   ———— 删除栈顶元素
 * top()   ———— 获取栈顶元素
 * min()   ———— 检索栈中的最小元素
 * 
 * @author hWX5322377
 *
 */

public class MinStack {
	private Stack<Integer> data;
	private Stack<Integer> helper;
	
	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		Utils.println(minStack.min());
		minStack.pop();
		Utils.println(minStack.top());
		Utils.println(minStack.min());
	}
	
	public MinStack() {
		data = new Stack<Integer>();
		helper = new Stack<Integer>();
	}
	
	public void push(int x) {
		data.add(x);
		if (helper.isEmpty() || helper.peek() >= x) {
			helper.add(x);
		} else {
			helper.add(helper.peek());
		} 
	}
	
	public void pop() {
		if (!data.isEmpty()) {
			data.pop();
			helper.pop();
		}
	}
	
	public int top() {
		if (!data.isEmpty()) {
			return data.peek();
		}
		throw new RuntimeException("栈元素为空！");
	}
	
	public int min() {
		if (!helper.isEmpty()) {
			return helper.peek();
		}
		throw new RuntimeException("栈元素为空！");
	}
}
