package designPatternPrj.creational.abstractFactory.ex01.after;

public class Client {

	public static void main(String args[]) {
		FactoryOfComputerFactory factoryOfComputerFactory = new FactoryOfComputerFactory();
		factoryOfComputerFactory.createComputer("LG");
	}

}
