package designPatternPrj.behavioral.strategy.ex04;

// 스트래티지 패턴
// https://unabated.tistory.com/entry/%EC%8A%A4%ED%8A%B8%EB%9E%98%ED%8B%B0%EC%A7%80-%ED%8C%A8%ED%84%B4Strategy-Pattern?category=435530

// 알고리즘군을 정의하고 각각을 캡슐화하여 교환해서 사용할 수 있도록 만든다.
// 스트레티지를 활용하면, 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.

public interface FlyBehavior {

	public void fly();

}
