package designPatternPrj.behavioral.strategy.ex02;

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
