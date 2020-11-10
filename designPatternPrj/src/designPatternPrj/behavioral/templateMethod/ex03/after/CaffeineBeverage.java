package designPatternPrj.behavioral.templateMethod.ex03.after;

public abstract class CaffeineBeverage {

	public void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		addcondiments();
	}

	protected abstract void brew();

	protected abstract void addcondiments();

	private void boilWater() {
		// TODO Auto-generated method stub
		System.out.println("물 끓이는 중");

	}

	private void pourInCup() {
		// TODO Auto-generated method stub
		System.out.println("컵에 따르는 중");

	}

}
