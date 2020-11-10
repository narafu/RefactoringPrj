package designPatternPrj.strategy.ex03.after;

public class Client {

	public static void main(String[] args) {

		Robot tackwonV = new TaekwonV("tackwonV");

		/* setting */
		tackwonV.setMove(new WalkingStrategy());
		tackwonV.setAttack(new MissileStrategy());

		System.out.println("my name is " + tackwonV.getName());
		tackwonV.move();
		tackwonV.attack();

		/* setting */
		System.out.println();
		tackwonV.setMove(new FlyingStrategy());

		System.out.println("my name is " + tackwonV.getName());
		tackwonV.move();
		tackwonV.attack();

		System.out.println();
		Robot sungard = new Sungard("sungard");
		sungard.setMove(new FlyingStrategy());
		sungard.setAttack(new MissileStrategy());
		
		System.out.println("my name is " + sungard.getName());
		sungard.move();
		sungard.attack();
	}

}
