package designPatternPrj.templateMethod.ex04;

public class WoodenHouse extends HouseTemplate {

	@Override
	protected void buildPillars() {
		System.out.println("Building Wooden Walls");

	}

	@Override
	public void buildWalls() {
		System.out.println("Building Pillars with Wood coating");

	}
}
