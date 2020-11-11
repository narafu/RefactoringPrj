package designPatternPrj.creational.factoryMethod.ex01.after;

import designPatternPrj.creational.factoryMethod.ex01.before.Type;

public class ClassA {

//	패턴을 적용하기 전, ClassA가 하던 일을, TypeFactory 클래스에 위임한다.
//	ClassA는 TypeFactory 클래스를 사용하여 객체를 생성한다.
//		객체의 결합도가 낮아지고, 유지보수가 용이해진다..
	
	public Type createType(String type) {

		TypeFactory factory = new TypeFactory();
		Type returnType = factory.createType(type);

		return returnType;

	}

}
