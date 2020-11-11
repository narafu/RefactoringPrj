package designPatternPrj.creational.factoryMethod.ex02;

public class Program {

	public static void main(String[] args) throws Exception {

		RobotFactory rf = new SuperRobotFactory();
		Robot r = rf.createRobot("super");
		Robot r2 = rf.createRobot("power");

		System.out.println(r.getName());
		System.out.println(r2.getName());

		RobotFactory mrf = new ModifiedSuperRobotFactory();
		Robot r3 = mrf.createRobot("designPatternPrj.creational.factoryMethod.ex02.SuperRobot");
		Robot r4 = mrf.createRobot("designPatternPrj.creational.factoryMethod.ex02.PowerRobot");

		System.out.println(r3.getName());
		System.out.println(r4.getName());

	}

}
