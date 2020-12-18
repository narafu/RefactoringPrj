package designPatternPrj.behavioral.strategy.ex04;

public class ModelDuck extends Duck {

	public ModelDuck() {

		quackBehavior = new Quack();
		flyBehavior = new FlyNoWay();
	}

	@Override
	public void display() {

		System.out.println("저는 모형오리 입니다.");
	}

}
