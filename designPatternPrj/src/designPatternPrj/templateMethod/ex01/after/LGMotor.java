package designPatternPrj.templateMethod.ex01.after;

import designPatternPrj.templateMethod.ex01.before.Direction;
import designPatternPrj.templateMethod.ex01.before.Door;

public class LGMotor extends Motor {

	public LGMotor(Door door) {
		super(door);
		// TODO Auto-generated constructor stub
	}

	protected void moveMotor(Direction direction) {
		/* LG Motor를 구동시킴 */
	}

}
