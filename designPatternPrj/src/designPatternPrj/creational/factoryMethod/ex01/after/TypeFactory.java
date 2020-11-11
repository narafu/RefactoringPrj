package designPatternPrj.creational.factoryMethod.ex01.after;

import designPatternPrj.creational.factoryMethod.ex01.before.Type;
import designPatternPrj.creational.factoryMethod.ex01.before.TypeA;
import designPatternPrj.creational.factoryMethod.ex01.before.TypeB;
import designPatternPrj.creational.factoryMethod.ex01.before.TypeC;

public class TypeFactory {

	public Type createType(String type) {

		Type returnType = null;

		switch (type) {

		case "A":
			returnType = new TypeA();
			break;

		case "B":
			returnType = new TypeB();
			break;

		case "C":
			returnType = new TypeC();
			break;
		}

		return returnType;

	}

}
