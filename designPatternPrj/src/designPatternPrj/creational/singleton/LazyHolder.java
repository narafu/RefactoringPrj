package designPatternPrj.creational.singleton;

public class LazyHolder {

	private LazyHolder() {
		// TODO Auto-generated constructor stub
	}

	private static class InnerInstanceClazz {
		private static final LazyHolder uniqueInstance = new LazyHolder();
	}

	public static LazyHolder getInstance() {
		return InnerInstanceClazz.uniqueInstance;
	}

}
