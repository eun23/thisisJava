package ch06.sec13.exam03.package2;

import ch06.sec13.exam03.package1.A;

public class C {
	public C() {
		A a = new A();

		a.field1 = 1;
//		a.field2 = 1; - Error: default 필드 접근 불가
//		a.field3 = 1; - Error: private 필드 접근 불가

		// 메소드 호출
		a.method1();
//		a.method2(); - Error: default 필드 접근 불가
//		a.method3(); - Error: private 필드 접근 불가
	}
}
