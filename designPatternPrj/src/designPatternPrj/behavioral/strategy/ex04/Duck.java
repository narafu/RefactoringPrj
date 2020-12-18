package designPatternPrj.behavioral.strategy.ex04;

public abstract class Duck {

	// 행동 인터페이스 형식의 레퍼런스 변수를 선언한다.
	// 모든 subClass에서 이 변수를 상속받는다.
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;

	public Duck() {
		// TODO Auto-generated constructor stub
	}

	public abstract void display();

	// 행동 클래스에 위임한다.
	public void performFly() {
		flyBehavior.fly();
	}

	// 행동 클래스에 위임한다.
	public void performQuack() {
		quackBehavior.quack();
	}

	public void swim() {
		System.out.println("모든 오리는 물에 뜬다.");
	}

	// 오리의 행동을 동적으로 지정
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}

	// 오리의 행동을 동적으로 지정
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}

}
