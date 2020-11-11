package designPatternPrj.creational.factoryMethod.ex01.before;

public class Client {

	public static void main(String[] args) {

		ClassA classA = new ClassA();
		classA.createType("A");
		classA.createType("C");

//		객체를 생성하는 일은 객체간의 결합도를 강하게 하는 일이고,
//		객체간 결합도가 강하면 유지보수가 어려워진다.
		// 따라서 팩토리 메소드를 사용하여, 객체 생성 역할을 맡긴다.
		
	}

}
