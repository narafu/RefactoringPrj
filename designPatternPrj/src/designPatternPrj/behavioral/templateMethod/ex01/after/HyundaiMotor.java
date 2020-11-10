package designPatternPrj.behavioral.templateMethod.ex01.after;

import designPatternPrj.behavioral.templateMethod.ex01.before.Direction;
import designPatternPrj.behavioral.templateMethod.ex01.before.Door;

public class HyundaiMotor extends Motor {

	public HyundaiMotor(Door door) {
		super(door);
	}

	protected void moveMotor(Direction direction) {
		/* Hyundai Motor를 구동시킴 */
	}

}
