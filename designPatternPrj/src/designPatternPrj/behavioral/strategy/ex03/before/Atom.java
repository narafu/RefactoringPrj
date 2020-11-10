package designPatternPrj.behavioral.strategy.ex03.before;

public class Atom extends Robot {

	public Atom(String name) {
		super(name);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void attack() {
		// TODO Auto-generated method stub
		System.out.println("I have strong punch.");
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("I can fly.");
	}

}
