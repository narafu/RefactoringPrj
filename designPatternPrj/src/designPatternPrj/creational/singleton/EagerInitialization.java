package designPatternPrj.creational.singleton;

public class EagerInitialization {

	private static EagerInitialization uniqueInstance = new EagerInitialization();

	private EagerInitialization() {
		// TODO Auto-generated constructor stub
	}

	public static EagerInitialization getInstance() {
		return uniqueInstance;
	}

}
