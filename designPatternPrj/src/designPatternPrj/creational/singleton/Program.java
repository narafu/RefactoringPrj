package designPatternPrj.creational.singleton;

public class Program {

	public static void main(String[] args) {

		for (int i = 0; i < 5; i++) {
			/* 생성자가 private이므로 불가 */
//			LazyHolder singleton = new LazyHolder();
//			System.out.println(singleton.toString());
		}

		LazyHolder obj = LazyHolder.getInstance();
//	 	LazyHolder.getInstance()는
//			InnerInstanceClazz.uniqueInstance를 리턴한다.

		for (int i = 0; i < 5; i++) {
			System.out.println(obj.toString());
		}

	}

}
