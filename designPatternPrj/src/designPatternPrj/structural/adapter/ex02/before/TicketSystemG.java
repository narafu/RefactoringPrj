package designPatternPrj.structural.adapter.ex02.before;

public class TicketSystemG implements TicketG {

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
		System.out.println("오프라인으로 구매합니다.");
	}

	@Override
	public void buyOnOnline() {
		// TODO Auto-generated method stub
		System.out.println("온라인으로 구매합니다.");
	}

	
	@Override
	public String getMenu() {
		// TODO Auto-generated method stub
		return "메뉴정보를 DB에서 가져왔습니다.";
	}

}
