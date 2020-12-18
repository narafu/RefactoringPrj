package designPatternPrj.behavioral.templateMethod.ex05;

import java.util.Scanner;

public class Coffee extends CaffeineBeverage {

	// 추상메소드 구현
	@Override
	void brew() {
		System.out.println("필터로 커피를 우려내는 중..");
	}

	// 추상메소드 구현
	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("설탕과 커피를 추가하는 중..");
	}

	// 구현메소드 재구현
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
		System.out.print("커피에 우유와 설탕을 넣어 드릴까요? (Y/N) ");

		Scanner scan = new Scanner(System.in);
		answer = scan.nextLine();

		return answer;
	}
}
