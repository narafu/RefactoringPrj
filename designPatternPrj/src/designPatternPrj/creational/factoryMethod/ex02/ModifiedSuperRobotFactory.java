package designPatternPrj.creational.factoryMethod.ex02;

public class ModifiedSuperRobotFactory extends RobotFactory {

	@Override
	Robot createRobot(String name) throws Exception {

		Class<?> cls = Class.forName(name);
		Object obj = cls.newInstance();
		return (Robot) obj;

	}

}
