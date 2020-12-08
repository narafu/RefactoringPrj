package designPatternPrj.creational.abstractFactory.ex01.before;

public class ComputerFactory {

	public void createComputer(String type) {
		
		KeyboardFactory keyboardFactory = new KeyboardFactory();
		MouseFactory mouseFactory = new MouseFactory();

		keyboardFactory.createKeyboard(type);
		mouseFactory.createMouse(type);
		
		System.out.println("--- " + type + " 컴퓨터 완성 ---");
		
	}

}
