package designPatternPrj.templateMethod.ex03.after;

public class Coffee extends CaffeineBeverage {

	@Override
	protected void brew() {
		// TODO Auto-generated method stub
		System.out.println("필터를 통해 커피를 우려내는 중");
	}

	@Override
	protected void addcondiments() {
		// TODO Auto-generated method stub
		System.out.println("설탕과 우유를 추가하는 중");
	}

}
