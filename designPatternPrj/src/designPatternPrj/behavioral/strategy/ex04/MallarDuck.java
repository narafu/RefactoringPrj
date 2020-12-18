package designPatternPrj.behavioral.strategy.ex04;

public class MallarDuck extends Duck {

	public MallarDuck() {

		// performQuack()이 호출되면, Quack 객체에게 위임(delegate)된다.
		quackBehavior = new Quack();
		// performFly()이 호출되면, FlyWithWings 객체에게 위임(delegate)된다.
		flyBehavior = new FlyWithWings();
	}

	// 추상 메소드 강제 구현
	@Override
	public void display() {

		System.out.println("저는 물오리 입니다.");
	}

}
