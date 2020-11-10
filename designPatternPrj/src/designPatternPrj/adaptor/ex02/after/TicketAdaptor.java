package designPatternPrj.adaptor.ex02.after;

import designPatternPrj.adaptor.ex02.before.TicketA;
import designPatternPrj.adaptor.ex02.before.TicketG;

public class TicketAdaptor implements TicketG {

	private TicketA ticket;

	public TicketAdaptor(TicketA ticket) {
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
