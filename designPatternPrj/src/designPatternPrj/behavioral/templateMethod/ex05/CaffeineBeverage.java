package designPatternPrj.behavioral.templateMethod.ex05;

// 템플릿 메소드
// https://unabated.tistory.com/category/%EB%94%94%EC%9E%90%EC%9D%B8%ED%8C%A8%ED%84%B4

// 템플릿 메소드를 이용하면 알고리즘 구조는 그대로 유지하면서 - 구조는 final 정의
// subClass에서 알고리즘의 특정 단계를 재정의할 수 있다.

// 알고리즘 여러 단계 중 일부는 추상 메소드로 정의하여
// subClass에서 특정 알고리즘을 제공할 수 있다.

// 카페인이 들어있는 음료를 만들기 위한 템플릿
public abstract class CaffeineBeverage {

	// subClass에서 이 메소드를 override 해서 아무렇게나 음료를 만들지 못하도록 final 선언.
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();

		// 손님이 첨가물을 넣어달라고 할 경우에만, 첨가물 첨가.
		if (customerWantsCondiments()) {
			addCondiments();
		}
	}

	// subClass에서 알아서 처리하도록 추상메소드로 선언.
	abstract void brew();

	// subClass에서 알아서 처리하도록 추상메소드로 선언.
	abstract void addCondiments();

	// 물을 끓이는 행동은 같으므로 구현(concrete) 메소드로 구현.
	void boilWater() {
		System.out.println("물 끊이는 중..");
	}

	// 컵에 따르는 행동은 같으므로 구현(concrete) 메소드로 구현.
	void pourInCup() {
		System.out.println("컵에 따르는 중..");
	}

	// Hook 메소드
	// subClass에서 필요에 따라 override 할 수 있는 메소드.
	boolean customerWantsCondiments() {
		return true;
	}
}
