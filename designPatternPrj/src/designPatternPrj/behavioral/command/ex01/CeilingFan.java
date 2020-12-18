package designPatternPrj.behavioral.command.ex01;

// Receiver : Receiver는 요구사항을 수행하기 위해 어떤 일을 처리해야 하는지 알고 있는 객체
// 천장팬을 작동시키는 클래스
public class CeilingFan {

	public static final int HIGH = 3;
	public static final int MEDIUM = 2;
	public static final int LOW = 1;
	public static final int OFF = 0;
	String location;
	int speed;

	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}

	public int getSpeed() {
		return speed;
	}

	public void high() {
		speed = HIGH;
	}

	public void medium() {
		speed = MEDIUM;
	}

	public void low() {
		speed = LOW;
	}

	public void off() {
		speed = OFF;
	}

}
