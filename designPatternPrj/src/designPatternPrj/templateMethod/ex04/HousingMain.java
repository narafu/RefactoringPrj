package designPatternPrj.templateMethod.ex04;

public class HousingMain {

	public static void main(String[] args) {

		HouseTemplate glassHouse = new GlassHouse();
		glassHouse.buildHouse();

		System.out.println();
		HouseTemplate woodenHouse = new WoodenHouse();
		woodenHouse.buildHouse();

	}

}
