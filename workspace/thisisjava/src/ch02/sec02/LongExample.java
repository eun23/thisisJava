package ch02.sec02;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 20L;
//		long var3 = 10000000000; - Error: 컴파일러는 int로 간주
		long var4 = 10000000000L;

		System.out.println(var1);
		System.out.println(var2);
		System.out.println(var4);
	}
}
