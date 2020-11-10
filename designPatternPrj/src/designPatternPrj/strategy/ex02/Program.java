package designPatternPrj.strategy.ex02;

import designPatternPrj.strategy.ex02.dynamic.RailStrategy;
import designPatternPrj.strategy.ex02.dynamic.RoadStrategy;
import designPatternPrj.strategy.ex02.passive.Bus;
import designPatternPrj.strategy.ex02.passive.Ship;
import designPatternPrj.strategy.ex02.passive.Train;
import designPatternPrj.strategy.ex02.passive.Vehicle;

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