package designPatternPrj.creational.abstractFactory.ex01.before;

public class Client {

	public static void main(String args[]) {
		ComputerFactory computerFactory = new ComputerFactory();
		computerFactory.createComputer("LG");
	}

}
