package designPatternPrj.behavioral.strategy.ex02;

public class Program {

	public static void main(String[] args) {

		Vehicle train = new Train();
		Vehicle bus = new Bus();

		train.move();
		bus.move();

		train.setMovableStrategy(new RailStrategy());
		train.move();
		bus.move();

		bus.setMovableStrategy(new RoadStrategy());
		train.move();
		bus.move();

		Vehicle ship = new Ship();
		ship.move();
		
		train.setMovableStrategy(new RoadStrategy());
		train.move();

	}
}