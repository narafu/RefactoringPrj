package designPatternPrj.templateMethod.ex01.after;

import designPatternPrj.templateMethod.ex01.before.Direction;
import designPatternPrj.templateMethod.ex01.before.Door;
import designPatternPrj.templateMethod.ex01.before.DoorStatus;
import designPatternPrj.templateMethod.ex01.before.MotorStatus;

public abstract class Motor {
	/* HyundaiMotor와 LGMotor의 공통적인 기능을 구현하는 클래스 */

	protected Door door;
	private MotorStatus motorStatus; /* 공통 2. motorStatus 필드 */

	public Motor(Door door) {
		this.door = door;
		motorStatus = MotorStatus.STOPPED;
	}

	/* 공통 3. etMotorStatus, setMotorStatus 메소드 */
	public MotorStatus getMotorStatus() {
		return motorStatus;
	}

	protected void setMotorStatus(MotorStatus motorStatus) {
		this.motorStatus = motorStatus;
	}

	/* 엘리베이터 제어 */
	public void move(Direction direction) {
		MotorStatus motorStatus = getMotorStatus();
		/* 이미 이동 중이면 아무 작업을 하지 않음 */
		if (motorStatus == MotorStatus.MOVING)
			return;

		DoorStatus doorStatus = door.getDoorStatus();
		/* 만약 문이 열려 있으면 우선 문을 닫음 */
		if (doorStatus == DoorStatus.OPENED)
			door.close();

		/* 모터를 주어진 방향으로 이동시킴 */
		moveMotor(direction);

		/* 모터 상태를 이동 중으로 변경함 */
		setMotorStatus(MotorStatus.MOVING);
	}

	protected abstract void moveMotor(Direction direction);

}
