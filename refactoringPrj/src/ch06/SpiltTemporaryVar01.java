package ch06;

public class SpiltTemporaryVar01 {

	private int _height;
	private int _width;

	void before() {
		double temp = 2 + (_height + _width);
		System.out.println(temp);
		temp = _height + _width;
		System.out.println(temp);
	}

//	루프 변수나 값 누적용 임시변수가 아닌 임시변수에 여러 번 값을 대입할 땐 각각 다른 임시변수를 사용하자.
	// 값이 두 번 이상 대입된다는 건, 그 변수가 메서드 안에서 여러 용도로 사용된다는 뜻이다.
	// 여러 용도로 사용되는 변수는 각 용도별로 다른 변수로 분리한다.
	
	void after() {
		double parameter = 2 + (_height + _width);
		System.out.println(parameter);
		double area = _height + _width;
		System.out.println(area);
	}

}
