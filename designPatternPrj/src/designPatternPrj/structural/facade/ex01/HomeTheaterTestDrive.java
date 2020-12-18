package designPatternPrj.structural.facade.ex01;

// Facade 패턴은 복잡하게 구성된 서브시스템을 단순화한 인터페이스를 통해 클라이언트에서 더 쉽게 사용하기 위한 용도로 쓰인다.
// 이 패턴을 이용하면 클라이언트와 서브시스템이 서로 긴밀하게 연결되지 않아도 되고, 여러 클래스들이 복잡하게 얽혀서 시스템의 한 부분을 변경했을 때,
// 다른 부분까지 줄줄 고쳐야 되는 상황을 미리 방지하는데 도움이 된다.

public class HomeTheaterTestDrive {

	public static void main(String[] args) {
		// 여기에 Components를 초기화함.

		HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}