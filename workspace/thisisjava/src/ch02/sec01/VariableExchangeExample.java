package ch02.sec01;

public class VariableExchangeExample {
	public static void main(String[] args) {
		int x = 3;
		int y = 5;
		System.out.println("x: " + x + ", y: " + y);

		// 변수의 값 교환
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x: " + x + ", y: " + y);
	}
}
