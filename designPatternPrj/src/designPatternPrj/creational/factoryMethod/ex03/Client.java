package designPatternPrj.creational.factoryMethod.ex03;

public class Client {

	public static void main(String[] args) {

		Factory factory = new IDCardFactory();
		Product card1 = factory.create("홍길동");
		Product card2 = factory.create("이순신");
		Product card3 = factory.create("임꺽정");
		card1.use();
		card2.use();
		card3.use();

	}

}
