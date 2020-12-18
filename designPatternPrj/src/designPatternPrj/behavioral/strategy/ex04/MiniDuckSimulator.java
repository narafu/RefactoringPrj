package designPatternPrj.behavioral.strategy.ex04;

public class MiniDuckSimulator {

	public static void main(String[] args) {

		Duck mallard = new MallarDuck();
		mallard.performFly();
		mallard.performQuack();

		Duck model = new ModelDuck();
		model.performFly();
		model.performQuack();
		model.setQuackBehavior(new MuteQuack());
		model.performQuack();

	}

}
