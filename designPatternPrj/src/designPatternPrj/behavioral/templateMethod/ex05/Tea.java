package designPatternPrj.behavioral.templateMethod.ex05;

import java.util.Scanner;

public class Tea extends CaffeineBeverage {

	// 추상 메소드 강제 구현
	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("차를 우려내는 중..");
	}

	// 추상 메소드 강제 구현
	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("레몬을 추가하는 중..");
	}

	// 구현 메소드 재구현
	@Override
	boolean customerWantsCondiments() {

		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	// 자체 메소드
	private String getUserInput() {

		String answer = "no";
		System.out.print("차에 레몬을 넣어 드릴까요? (Y/N) ");

		Scanner scan = new Scanner(System.in);
		answer = scan.nextLine();

		return answer;
	}

}
