package designPatternPrj.adaptor.ex02.before;

public class TicketMachine {

	public static void main(String[] args) {

		TicketA ticketA = new TicketSystemA();
		ticketA.choice(1);
		ticketA.buy();
		ticketA.print();

		System.out.println("");

		TicketG ticketG = new TicketSystemG();
		ticketG.choice(1);
		ticketG.buyOnOffline();
		ticketG.buyOnOnline();
		ticketG.print();
		System.out.println(ticketG.getMenu());

	}

}
