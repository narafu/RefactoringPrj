package designPatternPrj.strategy.ex03.before;

public class Sungard extends Robot {

	public Sungard(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("I have Missile.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("I can fly.");
	}

}
