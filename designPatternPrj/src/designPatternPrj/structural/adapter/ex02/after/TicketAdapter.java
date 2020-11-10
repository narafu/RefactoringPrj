package designPatternPrj.structural.adapter.ex02.after;

import designPatternPrj.structural.adapter.ex02.before.TicketA;
import designPatternPrj.structural.adapter.ex02.before.TicketG;

public class TicketAdapter implements TicketG {

//	TicketAdaptor는 TicketG 인터페이스를 구현하고 있지만,
//	TicketA 인터페이스를 주입함으로써, TicketA 인터페이스를 구현한 TicketSystemA를 호출할 수 있다.
//	그래서, Client는 TicketAdaptor를 통해, TicketG가 구현된 클래스가 아닌, TicketA가 구현된 TicketSystemA를 사용할 수 있다.
	
	private TicketA ticket;

	public TicketAdapter(TicketA ticket) {
		super();
		this.ticket = ticket;
	}

	@Override
	public void choice(int token) {
		// TODO Auto-generated method stub
		ticket.choice(token);
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		ticket.print();
	}

	@Override
	public void buyOnOffline() {
		// TODO Auto-generated method stub
		ticket.buy();
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
