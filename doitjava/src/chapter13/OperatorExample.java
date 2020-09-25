package chapter13;

import java.util.function.IntBinaryOperator;

public class OperatorExample {
	public static int[] scores = { 92, 95, 87 };

	public static int maxOrmin(IntBinaryOperator operator) {
		int result = scores[0];
		for (int score : scores) {
			result = operator.applyAsInt(result, score);
		}
		return result;
	}

	public static void main(String[] args) {

		int max = maxOrmin((a, b) -> {
			if (a >= b)
				return a;
			else
				return b;
		});
		System.out.println("�ִ밪: " + max);

		int min = maxOrmin(
				(a, b) -> {
					if (a <= b)
						return a;
					else
						return b;
		});
		System.out.println("�ּҰ�: " + min);

	}

}
