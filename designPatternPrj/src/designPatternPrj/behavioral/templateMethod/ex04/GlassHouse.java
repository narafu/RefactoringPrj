package designPatternPrj.behavioral.templateMethod.ex04;

public class GlassHouse extends HouseTemplate {

	@Override
	protected void buildPillars() {
		System.out.println("Building Glass Walls");

	}

	@Override
	public void buildWalls() {
		System.out.println("Building Pillars with glass coating");

	}

}
