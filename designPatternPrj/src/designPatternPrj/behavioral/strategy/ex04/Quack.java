package designPatternPrj.behavioral.strategy.ex04;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("빽");
	}

}
