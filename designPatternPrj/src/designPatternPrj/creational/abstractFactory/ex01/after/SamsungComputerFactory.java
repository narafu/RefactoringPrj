package designPatternPrj.creational.abstractFactory.ex01.after;

import designPatternPrj.creational.abstractFactory.ex01.before.SamsungKeyboard;
import designPatternPrj.creational.abstractFactory.ex01.before.SamsungMouse;

public class SamsungComputerFactory implements ComputerFactory {

	public SamsungKeyboard createKeyboard() {
		return new SamsungKeyboard();
	}

	public SamsungMouse createMouse() {
		return new SamsungMouse();
	}

}
