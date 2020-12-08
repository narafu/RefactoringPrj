package designPatternPrj.creational.abstractFactory.ex01.after;

import designPatternPrj.creational.abstractFactory.ex01.before.LGKeyboard;
import designPatternPrj.creational.abstractFactory.ex01.before.LGMouse;

public class LGComputerFactory implements ComputerFactory {

	public LGKeyboard createKeyboard() {
		return new LGKeyboard();
	}

	public LGMouse createMouse() {
		return new LGMouse();
	}

}
