package designPatternPrj.adaptor.ex01;

public class DuckTeatDrive {

	public static void main(String[] args) {

		MallardDuck duck = new MallardDuck();

		WildTurkey turkey = new WildTurkey();
		Duck turkeyAdaptor = new TurkeyAdaptor(turkey);

		System.out.println("The turkey says...");
		turkey.gobble();
		turkey.fly();

		System.out.println();
		System.out.println("The Duck says...");
		testDuck(duck);
		
		System.out.println();
		System.out.println("The TurkeyAdapter says...");
		testDuck(turkeyAdaptor);

	}

	private static void testDuck(Duck duck) {
		// TODO Auto-generated method stub
		duck.quack();
		duck.fly();
	}

}
