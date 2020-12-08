package designPatternPrj.creational.abstractFactory.ex01.after;

import designPatternPrj.creational.abstractFactory.ex01.before.Keyboard;
import designPatternPrj.creational.abstractFactory.ex01.before.Mouse;

public interface ComputerFactory {

	public Keyboard createKeyboard();

	public Mouse createMouse();

}
