package designPatternPrj.behavioral.strategy.ex03.after;

public abstract class Robot {

	private AttackStrategy attackStrategy;
	private MovingStrategy moveStrategy;
	private String name;

	public Robot(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setAttack(AttackStrategy attackStrategy) {
		this.attackStrategy = attackStrategy;
	}

	public void attack() {
		attackStrategy.attack();
	};

	public void setMove(MovingStrategy moveStrategy) {
		this.moveStrategy = moveStrategy;
	}

	public void move() {
		moveStrategy.move();
	};

}
