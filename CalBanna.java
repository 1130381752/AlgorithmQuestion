 package test;

/**
 * 编号：xxx
 * 难度：简单
 * 数香蕉：一只猴子有一堆香蕉，它从第1天开始，每天吃当前的一半加1个，第10天也这样吃了之后，
 * 最后只剩下1个，求香蕉一共有多少个。
 * @author hWX5322377
 *
 */

public class CalBanna {
	public static void main(String[] args) {
		int day11 = 1;
		int day10 = (1+day11)*2-day11;
		int sum = day11;
		for (int i = 0; i < 10; i++) {
			sum += day10 * Math.pow(2, i);
		}
		println(sum);
	}
	
	public static void println(Object s) {
		System.out.println(String.valueOf(s));
	}
}
