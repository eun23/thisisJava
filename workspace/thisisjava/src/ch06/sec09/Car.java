package ch06.sec09;

public class Car {
	// 필드 선언
	String model;
	int speed;

	// 생성자 선언
	Car(String model) {
		this.model = model; // 매개변수를 필드에 대입
	}

	// 메소드 선언
	void setSpeed(int speed) {
		this.speed = speed; // 매개변수를 필드에 대입
	}

	void run() {
		setSpeed(100);
		System.out.println(model + "가 달립니다. (시속: " + speed + "km/h)");
	}
}
