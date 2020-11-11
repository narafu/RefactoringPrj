package designPatternPrj.creational.singleton;

public class LazyInitializationSyn {

	private static LazyInitializationSyn uniqueInstance;

	private LazyInitializationSyn() {
		// TODO Auto-generated constructor stub
	}

	public static synchronized LazyInitializationSyn getInstance() {

		if (uniqueInstance == null) {
			uniqueInstance = new LazyInitializationSyn();
		}
		return uniqueInstance;

	}

}
