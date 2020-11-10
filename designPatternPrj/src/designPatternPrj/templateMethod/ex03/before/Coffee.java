package designPatternPrj.templateMethod.ex03.before;

public class Coffee {

	public void prepareRecipe() {
		boilWater();
		brewCoffeeCrind();
		pourInCup();
		addSugarAndMilk();
	}

	private void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("물 끓이는 중");

	}

	private void brewCoffeeCrind() {
		// TODO Auto-generated method stub
		System.out.println("필터를 통해 커피를 우려내는 중");

	}

	private void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("컵에 따르는 중");

	}

	private void addSugarAndMilk() {
		// TODO Auto-generated method stub
		System.out.println("설탕과 우유를 추가하는 중");

	}

}
