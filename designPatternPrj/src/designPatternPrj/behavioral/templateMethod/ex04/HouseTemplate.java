package designPatternPrj.behavioral.templateMethod.ex04;

public abstract class HouseTemplate {

	public final void buildHouse() {
		buildFoundation();
		buildPillars();
		buildWalls();
		buildWindows();
		System.out.println("House is built.");
	}

	private void buildFoundation() {
		// TODO Auto-generated method stub
		System.out.println("Building foundation with cement,iron rods and sand");
	}

	protected abstract void buildPillars();

	public abstract void buildWalls();

	private void buildWindows() {
		// TODO Auto-generated method stub
		System.out.println("Building Glass Windows");
	}

}
