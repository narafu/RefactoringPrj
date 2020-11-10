package designPatternPrj.structural.adapter.ex02.before;

public class NewTicketSystem implements TicketG {

	@Override
	public void choice(int token) {
		// TODO Auto-generated method stub
		System.out.println("선택된 식권 타입은... " + token + " 입니다.");

	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("식권을 출력합니다.");

	}

	@Override
	public void buyOnOffline() {
		// TODO Auto-generated method stub
		System.out.println("식권을 구매합니다.");
	}

	@Override
	public void buyOnOnline() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("지원되지 않는 기능");
	}

	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("지원되지 않는 기능");
	}

}
