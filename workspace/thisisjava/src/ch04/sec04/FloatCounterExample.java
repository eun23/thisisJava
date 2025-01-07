package ch04.sec04;

public class FloatCounterExample {
	public static void main(String[] args) {
		// 부동 소수점 방식의 float 타입은 연산과정에서 정확히 0.1을 표현하지 못하기 때문에
		// 실제 값은 0.1보다 클 수 있다.
		// 따라서 최종 반복 횟수는 9번이 된다.
		for (float x = 0.1f; x <= 1.0f; x += 0.1f) {
			System.out.println(x);
		}
	}
}
