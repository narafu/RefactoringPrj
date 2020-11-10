package designPatternPrj.strategy.ex02.passive;

import designPatternPrj.strategy.ex02.dynamic.MovableStrategy;

public class Vehicle {

	MovableStrategy movableStrategy;
	String type;

	public void setMovableStrategy(MovableStrategy movableStrategy) {
		this.movableStrategy = movableStrategy;
	}

	public void move() {
		setType();
		if (isWhere()) {
			System.out.println("정차중입니다.");
		} else {
			movableStrategy.move();
		}
	}

	private boolean isWhere() {
		return movableStrategy == null;
	}

	private void setType() {
		System.out.print(type + " : ");
	}

}
