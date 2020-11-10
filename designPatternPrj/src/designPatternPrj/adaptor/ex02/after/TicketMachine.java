package designPatternPrj.adaptor.ex02.after;

import designPatternPrj.adaptor.ex02.before.TicketG;
import designPatternPrj.adaptor.ex02.before.TicketSystemA;

public class TicketMachine {

	public static void main(String[] args) {

		TicketG ticketG = new TicketAdaptor(new TicketSystemA());
		ticketG.choice(1);
		ticketG.buyOnOffline();
		ticketG.print();

		try {
			System.out.println(ticketG.getMenu());
		} catch (UnsupportedOperationException e) {
			System.out.println("이 서비스는 G사의 다른 시스템에서 제공되는 기능입니다.");
		}

	}
}
