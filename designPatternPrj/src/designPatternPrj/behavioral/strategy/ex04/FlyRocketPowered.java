package designPatternPrj.behavioral.strategy.ex04;

public class FlyRocketPowered implements FlyBehavior {

	@Override
	public void fly() {
		System.out.println("로켓추진으로 날아갑니다.");
	}

}
