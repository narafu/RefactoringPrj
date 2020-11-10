package designPatternPrj.strategy.ex01;

public class Player {

	Weapon weapon;

	void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	void attack() {
		if (weapon == null)
			System.out.println("맨손 공격");
		else
			weapon.attack();
	}

}
