package designPatternPrj.strategy.ex01;

public class Program {

	public static void main(String[] args) {

		Player player = new Player();

		player.attack();

		player.setWeapon(new Sword());
		player.attack();

		player.setWeapon(new Knife());
		player.attack();

	}

}
