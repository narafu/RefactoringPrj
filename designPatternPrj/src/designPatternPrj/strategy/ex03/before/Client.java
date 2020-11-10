package designPatternPrj.strategy.ex03.before;

public class Client {

	public static void main(String[] args) {

		Robot taekwonV = new TaekwonV("TaekonV");
		Robot atom = new Atom("atom");

		System.out.println("My name is " + taekwonV.getName());
		taekwonV.move();
		taekwonV.attack();

		System.out.println();
		System.out.println("My name is " + atom.getName());
		atom.move();
		atom.attack();

//		태권V의 이동방법(move())이 walk -> fly로 바뀐다면?
//		아톰의 이동방법(move())이 fly -> walk로 바뀐다면?

//		현재 시스템의 캡슐단위가 Robot이므로, 새로운 로못(선가드)가 추가는 쉽다.
//		but, 선가드의 공격방법(attack())이 missile, 이동방법(move())이 fly라면,
//		선가드의 attack()은 태권V의 attack()과, 선가드의 move()는 아톰의 move()와 중복된다.

		System.out.println();
		Robot sungard = new Sungard("sungard");
		System.out.println("My name is " + sungard.getName());
		sungard.move();
		sungard.attack();
		
	}

}
