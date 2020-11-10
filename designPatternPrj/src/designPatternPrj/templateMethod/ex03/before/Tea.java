package designPatternPrj.templateMethod.ex03.before;

public class Tea {

	public void prepareRecipe() {
		boilWater();
		steepTeaBag();
		pourInCup();
		addLemon();
	}

	private void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("물 끓이는 중");

	}

	private void steepTeaBag() {
		// TODO Auto-generated method stub
		System.out.println("차를 우려내는 중");

	}

	private void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("컵에 따르는 중");

	}

	private void addLemon() {
		// TODO Auto-generated method stub
		System.out.println("레몬을 추가하는 중");

	}

}
