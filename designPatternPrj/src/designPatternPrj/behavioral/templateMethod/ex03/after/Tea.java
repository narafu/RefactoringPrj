package designPatternPrj.behavioral.templateMethod.ex03.after;

public class Tea extends CaffeineBeverage {

	@Override
	protected void brew() {
		// TODO Auto-generated method stub
		System.out.println("차를 우려내는 중");

	}

	@Override
	protected void addcondiments() {
		// TODO Auto-generated method stub
		System.out.println("레몬을 추가하는 중");

	}

}
