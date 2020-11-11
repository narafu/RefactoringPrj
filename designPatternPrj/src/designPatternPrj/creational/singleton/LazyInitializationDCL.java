package designPatternPrj.creational.singleton;

public class LazyInitializationDCL {

	private volatile static LazyInitializationDCL uniqueInstance;

	private LazyInitializationDCL() {
		// TODO Auto-generated constructor stub
	}

	public LazyInitializationDCL getInstance() {

		if (uniqueInstance == null) {
			synchronized (LazyInitializationDCL.class) {
				if (uniqueInstance == null) {
					uniqueInstance = new LazyInitializationDCL();
				}
			}
		}
		return uniqueInstance;

	}

}
